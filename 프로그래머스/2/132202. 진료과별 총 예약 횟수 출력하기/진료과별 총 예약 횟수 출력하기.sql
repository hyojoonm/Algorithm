-- 코드를 입력하세요
SELECT MCDP_CD , COUNT(*)
FROM APPOINTMENT 
WHERE DATE_FORMAT(APNT_YMD,'%Y-%m') = '2022-05'
group by MCDP_CD
order by COUNT(*) ASC , MCDP_CD ASC