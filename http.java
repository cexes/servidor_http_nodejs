const http = require('http')

const port = 3000

const server = http.createServer((req, res) =>{
  
     res.write("Isso é muito bizarro")
     res.end()

})
server.listen(port,()=>{
    console.log(`o servidor esta rodando na porta ${port}`)
})
