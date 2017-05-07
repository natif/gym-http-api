-------------------------------------------------------------------------------
-- |
-- Module    :  OpenAI.Gym.Client
-- License   :  MIT
-- Stability :  experimental
-- Portability: non-portable
-------------------------------------------------------------------------------
{-# LANGUAGE MultiParamTypeClasses #-}
module OpenAI.Gym.Prelude (module P) where

import Control.Monad              as P
import Control.Monad.Loops        as P
import Control.Monad.Trans.Except as P (runExceptT)
import Control.Monad.Trans.Reader as P
import Control.Monad.Trans.Class  as P
import Data.Aeson                 as P
import Data.HashMap.Strict        as P (HashMap)
import Data.Proxy                 as P
import Data.Text                  as P (Text)
import GHC.Generics               as P
import Network.HTTP.Client        as P hiding (Proxy, responseBody, responseStatus)
import Servant.API                as P
import Servant.Client             as P
import Servant.HTML.Lucid         as P (HTML)

instance MimeUnrender HTML () where
    mimeUnrender _ _ = return ()
