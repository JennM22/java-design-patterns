Jennifer Martin

@ -99,11 +99,11 @@ public class BookViewModel {
</zk>
```

Note: 
* To deploy this, go to model-view-viewmodel folder and run: 
* mvn clean install
* mvn jetty:run -Djetty.http.port=9911
* In browser, http://localhost:9911/model-view-viewmodel/
To deploy the example, go to model-view-viewmodel folder and run:

* `mvn clean install`
* `mvn jetty:run -Djetty.http.port=9911`
* Open browser to address: http://localhost:9911/model-view-viewmodel/

## Class diagram