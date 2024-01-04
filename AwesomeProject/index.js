/**
 * @format
 */

import {AppRegistry} from 'react-native';

const CommonApp = () => null;

if (__DEV__) {
    console.log('hello111 Ravinder')
    require('./packages/appA');
    require('./packages/appB');
} else {
  AppRegistry.registerComponent('CommonApp', () => CommonApp);
}
