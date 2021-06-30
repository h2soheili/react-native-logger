import { NativeModules } from 'react-native';

type LoggerType = {
  multiply(a: number, b: number): Promise<number>;
  logErrorNative(error: string, label: string): Promise<boolean>;
};

const { Logger } = NativeModules;

export default Logger as LoggerType;
