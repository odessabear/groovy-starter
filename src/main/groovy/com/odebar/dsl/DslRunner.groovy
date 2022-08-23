package com.odebar.dsl

import static com.odebar.dsl.DslBuilder.*

//def email = new Email()
//email.setFrom("from@mail.com")
//email.setTo("to@mail.com")
//email.setTitle("title")
//
//def body = new EmailBody()
//body.setText("sdfsdfs")
//body.setImages(List.of("image.jpg"))
//email.setBody(body)

// builder
mail {
    from "from@mail.com"
    to "to@mail.com"
    title "title"
    body {
        text "text of the letter"
        images(['image.jpg', 'image2.png'])
        image 'test.jpeg'
    }
}