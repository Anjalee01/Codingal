---------------------------------------------------------
-- Create hacker_news table
---------------------------------------------------------
CREATE TABLE hacker_news (
    id INT PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(100),
    category VARCHAR(50),
    points INT,
    comments INT,
    created_at DATE
);

---------------------------------------------------------
-- Insert sample data
---------------------------------------------------------
INSERT INTO hacker_news (id, title, author, category, points, comments, created_at) VALUES
(1, 'AI breaks new record', 'sam', 'Technology', 520, 180, '2025-01-10'),
(2, 'Python 4.0 Released', 'alex', 'Programming', 480, 220, '2025-02-01'),
(3, 'Cybersecurity warning issued', 'mike', 'Security', 300, 95, '2025-01-25'),
(4, 'Open-source community grows', 'hana', 'Community', 150, 60, '2025-01-15'),
(5, 'New JavaScript framework launched', 'ria', 'Programming', 420, 130, '2025-01-20'),
(6, 'Quantum computer update', 'lee', 'Technology', 610, 200, '2025-02-05');

---------------------------------------------------------
-- Karan wants the BEST news.
-- Best = highest points + most engagement
-- We use TOP + ORDER BY
---------------------------------------------------------

-- Get top 3 best performing news
SELECT TOP 3 *
FROM hacker_news
ORDER BY points DESC, comments DESC;

---------------------------------------------------------
-- Group by category to understand which type performs best
---------------------------------------------------------
SELECT 
    category,
    COUNT(*) AS total_news,
    AVG(points) AS avg_points,
    MAX(points) AS max_points,
    MIN(points) AS min_points
FROM hacker_news
GROUP BY category
ORDER BY avg_points DESC;


-- TOP 1 BEST NEWS OVERALL (final answer for Karan)

SELECT TOP 1 *
FROM hacker_news
ORDER BY points DESC, comments DESC;
