# Scheduling Project

Simulate three CPU scheduling techniques: 

1.	Multilevel Feedback Queue (MLFQ) [1]; MLFQ utilizes multiple queues and allows processes to move between queues dynamically. 
In this approach, processes "find their own level" based on their CPU burst . Processes that have a larger CPU burst moves to a 
lower-priority queue. 

2.	Lottery Scheduling [2], each process is given some lottery tickets. A lottery is held at regular intervals and the winner 
is determined by selecting a ticket at random. The winning process gets to be executed next. A process will have a chance of 
winning proportionate to the number of tickets it has. To increase the chances of winning, higher priority processes can get 
more tickets. Lottery Scheduling guarantees a non-zero probability for any process to get executed and hence solves the 
starvation problem. 

3.	Fair-Share Scheduling [3]: divide CPU time evenly among users and then among processes. For example, if we have two users 
X and Y in the system and each has one process, A and B respectively. Then these will be scheduled in this fashion: A B A B A B 
…., resulting in each user getting 50% of the CPU time. However, if user X has two processes A and C, with 50% to each user, 
the processes will be scheduled as A B C B A B C B…., then A will take 25%, B 50% and C 25%. If on the other hand a third user 
Z has a process C then each user will take 1/3 of CPU time and the processes are scheduled as A B C A B C….., with A taking 
33.3%, B 33.3% and C 33.3%.

Test and compare the Performance of the three schedulers using a performance metric(s) (e.g. waiting time) of your choice under 
different CPU-I/O bound loads

How would the three schedulers perform on multicore processors?


Submit a report that explains your 
•	implementation details 
•	assumptions
•	values for parameters: e.g. quantum value, number of tickets,...etc., 
•	explanation of testing method, creation of jobs: random, poisson arrival -exponential departure,...etc. CPU-bound or I/O bound  
•	discussion of the results 

Submit your code

References:

[1]  Hoganson K., Reducing MLFQ Scheduling Starvation with Feedback and Exponential Averaging, The Journal of Computing Sciences 
in Colleges, 25, (2), 196- 202, 2009.

[2]  Waldspurger and Weihl, Lottery Scheduling: Flexible Proportional-Share Resource Management, Proceedings of First Symposium 
on Operating System Design and Implementation, 1-12, 1994.

[3] Henry G., The Fair Share Scheduler, AT&T Bell Lab Technical Journal, 63, (8), 1845-1857 1984.
