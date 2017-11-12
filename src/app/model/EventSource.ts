/**
 * Created by fadal on 12/11/2017.
 */


type Callback = (data: any) => void;

declare class EventSource {
  onmessage: Callback;
  onerror: Callback;
  close: () => void;
  addEventListener(event: string, cb: Callback): void;
  constructor(name: string);
}
