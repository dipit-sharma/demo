# create table - users

# create table - expenses

# create table - connections

# manually add

CREATE TABLE users (
user_id VARCHAR(10) PRIMARY KEY,
name VARCHAR(50),
photo VARCHAR(100),
email VARCHAR(100) UNIQUE,
password VARCHAR(50),
spent INT,
debt INT,
phone VARCHAR(10)
);

CREATE TABLE connections (
connection_id VARCHAR(50) PRIMARY KEY,
name VARCHAR(100),
description VARCHAR(255)
);

CREATE TABLE connection_members (
connection_id VARCHAR(50),
user_id VARCHAR(50),
PRIMARY KEY (connection_id, user_id),
FOREIGN KEY (connection_id) REFERENCES connections(connection_id) ON DELETE CASCADE,
FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);

CREATE TABLE expenses (
expense_id VARCHAR(50) PRIMARY KEY,
amount DECIMAL(10,2),
paid_by VARCHAR(50), -- User who paid
split_type ENUM('E', 'P', 'R'), -- E: Equal, P: Percentage, R: Ratio
expense_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
description VARCHAR(255),
connection_id VARCHAR(50), -- Expense can be part of a group
FOREIGN KEY (paid_by) REFERENCES users(user_id) ON DELETE CASCADE,
FOREIGN KEY (connection_id) REFERENCES connections(connection_id) ON DELETE CASCADE
);

CREATE TABLE expense_participants (
expense_id VARCHAR(50),
user_id VARCHAR(50),
share DECIMAL(10,2), -- Amount user owes
PRIMARY KEY (expense_id, user_id),
FOREIGN KEY (expense_id) REFERENCES expenses(expense_id) ON DELETE CASCADE,
FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);

CREATE TABLE settlements (
settlement_id VARCHAR(50) PRIMARY KEY,
connection_id VARCHAR(50),
paid_by VARCHAR(50),
paid_to VARCHAR(50),
amount DECIMAL(10,2),
settled_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
FOREIGN KEY (connection_id) REFERENCES connections(connection_id) ON DELETE CASCADE,
FOREIGN KEY (paid_by) REFERENCES users(user_id) ON DELETE CASCADE,
FOREIGN KEY (paid_to) REFERENCES users(user_id) ON DELETE CASCADE
);

-- INSERT INTO users (user_id, name, photo, email, password, spent, debt, phone) VALUES
-- ('9876543210', 'Alice', '', 'alice@example.com', 'pass123', 0, 0, '9876543210'),
-- ('9876543211', 'Bob', '', 'bob@example.com', 'securepass', 0, 0, '9876543211'),
-- ('9876543212', 'Charlie', '', 'charlie@example.com', 'mypassword', 0, 0, '9876543212');

-- INSERT INTO users (user_id, name, photo, email, password, spent, debt, phone) VALUES
-- ('9876543213', 'David', 'david.jpg', 'david@example.com', 'davidpass', 400, 50, '9876543213'),
-- ('9876543214', 'Emma', 'emma.jpg', 'emma@example.com', 'emmapass', 700, 300, '9876543214'),
-- ('9876543215', 'Frank', 'frank.jpg', 'frank@example.com', 'frankpass', 200, 75, '9876543215'),
-- ('9876543216', 'Grace', 'grace.jpg', 'grace@example.com', 'gracepass', 350, 90, '9876543216'),
-- ('9876543217', 'Hannah', 'hannah.jpg', 'hannah@example.com', 'hannahpass', 450, 110, '9876543217'),
-- ('9876543218', 'Isaac', 'isaac.jpg', 'isaac@example.com', 'isaacpass', 550, 160, '9876543218'),
-- ('9876543219', 'Jack', 'jack.jpg', 'jack@example.com', 'jackpass', 800, 250, '9876543219');

INSERT INTO connections (connection*id, name)
SELECT CONCAT(u1.user_id, '*', u2.user_id) AS group_id,
CONCAT('', u1.name, ' and ', u2.name) AS name
FROM users u1
JOIN users u2 ON u1.user_id < u2.user_id;

INSERT INTO connection_members (connection_id, user_id)
SELECT g.connection_id, u.user_id
FROM connections g
JOIN users u ON g.connection_id LIKE CONCAT('%', u.user_id, '%');
