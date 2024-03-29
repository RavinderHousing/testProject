import React from 'react';
import {AppRegistry} from 'react-native';
import {StyleSheet, Text, TouchableOpacity, View} from 'react-native';

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  back: {
    flex: 0.03,
    marginLeft: 10,
    marginTop: 10,
    justifyContent: 'center',
  },
  header: {
    flex: 0.05,
    justifyContent: 'center',
    alignItems: 'center',
  },
  button: {
    flex: 0.1,
    marginVertical: 4,
    borderColor: 'orange',
    borderWidth: 2,
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 20,
  },
  buttonContainer: {
    flex: 0.5,
    justifyContent: 'center',
  },
});

function App() {
  const navigateToAppB = () => {
    console.log('Ravinder:navigateToAppB');
  };

  const navigateBack = () => {
    console.log('Ravinder:navigateBack');
  };

  console.log('hello111 A')

  return (
    <View style={styles.container}>
      <TouchableOpacity onPress={() => navigateBack()} style={styles.back}>
        <Text>Back</Text>
      </TouchableOpacity>
      <View style={styles.header}>
        <Text>Welcome to App A</Text>
      </View>
      <View style={styles.buttonContainer}>
        <TouchableOpacity
          style={styles.button}
          onPress={() => navigateToAppB()}>
          <Text>Navigate to App B</Text>
        </TouchableOpacity>
      </View>
    </View>
  );
}

AppRegistry.registerComponent('AppA', () => App);