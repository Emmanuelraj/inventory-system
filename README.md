# inventory-system
 Inventory-system using spring boot &amp; mvc& interceptor& https keystore & dockerfile & eureka-client& eureka-server
# How to run
       First go to inventory-system-eureka-server branch clone and run it 
       Then come to main branch clone it & run it 
# How it works :
       user can view the products & delete the products
# UseCaseDiagram                  
        user can change the price as (increasePercentage %) it reflect all products             
# Url : 
      https://localhost:8050/inventory/viewProducts.htm  --> view All Products               GET
      https://localhost:8050/inventory/addProducts.htm   --> Add Products                    GET
      https://localhost:8050/inventory/load              --> Add Products                    POST 
      https://localhost:8050/inventory/priceIncrease.htm --> Get (%)                         POST
      https://localhost:8050/inventory/priceIncrease     -->(max 1 to 50)                    POST
      https://localhost:8050/inventory/view/{id}         --> deleteById                      POST
# Interceptor
       For further details : https://github.com/Emmanuelraj/inventory-system/blob/interceptor/README.md      
 # Command :
        mvn clean install - Plain maven clean and install
          
         
      
      
      
      
      
        
