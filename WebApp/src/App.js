import { useEffect } from "react";
import "./App.css";
const tg = window.Telegram.WebApp;

function App() {
  useEffect(() => {
    tg.ready();
  }, []);

  const onClick = () => {
    tg.close();
  };

  return (
    <div className="App">
      <h>Work</h>
      <button onClick={onClick}>Закрыть</button>
    </div>
  );
}

export default App;
