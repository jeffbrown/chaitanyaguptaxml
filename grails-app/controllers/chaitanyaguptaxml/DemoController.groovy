package chaitanyaguptaxml

class DemoController {

    def index() {
        def requestBody = '[not xml]'
        request.withFormat {
            xml {
                requestBody = request.XML
            }
        }
        render requestBody
    }
}
