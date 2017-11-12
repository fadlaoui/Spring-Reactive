import { ReactiveClientPage } from './app.po';

describe('reactive-client App', () => {
  let page: ReactiveClientPage;

  beforeEach(() => {
    page = new ReactiveClientPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
