import {
  Drawer,
  List,
  ListItem,
  ListItemButton,
  ListItemIcon,
  ListItemText,
  Box,
} from "@mui/material";

import { ReactNode } from "react";
import { useNavigate } from "react-router-dom";
import { BaseTemplateConst } from "./BaseTemplateConst";

export type BaseDrawerMenuProps = {
  menuInfo: MenuListProps[];
};
export const BaseDrawerMenu = (props: BaseDrawerMenuProps) => {
  const drawerWidth = 200;

  return (
    <>
      <Drawer
        variant="permanent"
        sx={{
          width: drawerWidth,
          flexShrink: 0,
          [`& .MuiDrawer-paper`]: {
            width: drawerWidth,
            boxSizing: "border-box",
          },
        }}
      >
        <Box
          sx={{
            overflow: "auto",
            paddingTop: BaseTemplateConst.APP_BAR_MIN_HEIGHT,
          }}
        >
          <List>
            {props.menuInfo.map((elem, index) => {
              return <MenuListItem key={index} {...elem} />;
            })}
          </List>
        </Box>
      </Drawer>
    </>
  );
};

type MenuListProps = {
  text: string;
  icon: ReactNode;
  toPath: string;
};
const MenuListItem = (props: MenuListProps) => {
  const navigate = useNavigate();

  const onClickHandler = () => {
    navigate(props.toPath);
  };

  return (
    <>
      <ListItem disablePadding sx={{ display: "block" }}>
        <ListItemButton
          onClick={onClickHandler}
          sx={{
            minHeight: 48,
            justifyContent: "initial",
            px: 2.5,
          }}
        >
          <ListItemIcon
            sx={{
              minWidth: 0,
              mr: 3,
              justifyContent: "center",
            }}
          >
            {props.icon}
          </ListItemIcon>
          <ListItemText primary={props.text} />
        </ListItemButton>
      </ListItem>
    </>
  );
};
