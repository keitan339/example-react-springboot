import {
  BaseTemplate,
  BaseTemplateProps,
} from "./component/template/BaseTemplate";
import HomeIcon from "@mui/icons-material/Home";
import PersonIcon from "@mui/icons-material/Person";
import CalendarMonthIcon from "@mui/icons-material/CalendarMonth";
import BusinessCenterIcon from "@mui/icons-material/BusinessCenter";
import { BaseRouter } from "./router/BaseRouter";
import { BaseRoutes } from "./router/BaseRoutes";
import { RouteInfo } from "./router/RouteInfo";

function App() {
  const drawerMenuInfo: BaseTemplateProps["drawerMenuInfo"] = [
    {
      text: "Home",
      icon: <HomeIcon />,
      toPath: "/",
    },
    {
      text: "Departments",
      icon: <BusinessCenterIcon />,
      toPath: "/Departments",
    },
    {
      text: "Employees",
      icon: <PersonIcon />,
      toPath: "/Employees",
    },
    {
      text: "Shifts",
      icon: <CalendarMonthIcon />,
      toPath: "/Shifts",
    },
  ];

  return (
    <BaseRouter>
      <BaseTemplate drawerMenuInfo={drawerMenuInfo}>
        <BaseRoutes routeList={RouteInfo}></BaseRoutes>
      </BaseTemplate>
    </BaseRouter>
  );
}

export default App;
