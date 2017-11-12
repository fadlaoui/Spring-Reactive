/**
 * Created by fadal on 12/11/2017.
 */
export class Person {
  id: string;
  name: string;

  constructor(jsonData) {
    Object.assign(this, jsonData);
  }
}
