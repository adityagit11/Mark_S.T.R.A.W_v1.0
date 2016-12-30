# STRAWdemo
STRAW Project demo - Using Selenium Webdriver framwork and Java FX framework on Java Language to Automate Facebook

Introducing S.T.R.A.W, an acronym for Speech to Text Recognition for Automating Web-browser. It is an application for voice automation of general browsing experience for user,

#To Whom It Will Benefit?

    1.People deprived of sight can use browser by simple voice commands without the use of external peripherals.

    2.General Public - On an average you spend 60% of your time in virtual world to accomplish just 20% of task. Wouldn't it be    awesome to save time? To control your browser by just your voice commands?

#Architecture Diagram


![Alt text](https://github.com/adityasingh11/STRAWdemo/blob/master/S.T.R.A.W-page-001.jpg)


#Architecture

It works in three stages,

    1.UI Deployment : Developed upon Java FX GUI. The input to this stage is the real time digital reconstruction of voice commands by user. The commands are entered in terminal window developed by the developer.

    2.Voice Command Recognition : Based on CMU Sphinx 4 Voice recognition library which is an open source tool. The grammar file and the language model are set by the user prior to use. The command is recognized from a set of pre - set commands in the SQL/text repository. The output of this stage is the recognized command.

    3.Selenium Framework : In the final stage the recognized command is sent to the webdriver like Firefox/Chrome Webdriver which is further used to manipulate/interact with the Web - Elements of the site.
