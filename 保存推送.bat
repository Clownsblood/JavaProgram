@echo off
set /p commit_message=�������ύ��Ϣ: 
cd F:\github�̲�\JavaProgram
git add *
git commit -m "%commit_message%"
git push
pause