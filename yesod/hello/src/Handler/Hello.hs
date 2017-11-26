{-# LANGUAGE NoImplicitPrelude #-}
module Handler.Hello where

import Import

getHelloR :: Handler Html
getHelloR = return $ toHtml "Hello, world!"
