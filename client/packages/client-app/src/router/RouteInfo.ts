import { DepartmentsPageConfig } from "../component/page/departments/DepartmentsPageConfig";
import { EmployeesPageConfig } from "../component/page/employees/EmployeesPagesConfig";
import { HomePageConfig } from "../component/page/home/HomePageConfig";
import { ShiftsPageConfig } from "../component/page/shifts/ShiftsPageConfig";
import { BaseRouteProps } from "./BaseRoutes";

export const RouteInfo: BaseRouteProps[] = [
  HomePageConfig,
  DepartmentsPageConfig,
  EmployeesPageConfig,
  ShiftsPageConfig,
];
