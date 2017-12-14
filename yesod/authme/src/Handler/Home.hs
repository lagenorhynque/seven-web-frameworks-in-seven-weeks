{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE TemplateHaskell #-}
module Handler.Home where

import Import

getHomeR :: Handler Html
getHomeR = do
    user <- maybeAuth
    defaultLayout $ do
        setTitle "AuthMe"
        $(widgetFile "homepage")
