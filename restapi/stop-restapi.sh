pid=`(lsof -i:100 -t)`
kill -TERM $pid || kill -KILL $pid
echo "Kill ${pid}"