declare type LoggerType = {
    multiply(a: number, b: number): Promise<number>;
    logErrorNative(error: string, label: string): Promise<boolean>;
};
declare const _default: LoggerType;
export default _default;
