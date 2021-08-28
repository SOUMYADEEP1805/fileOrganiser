#!/usr/bin/env node
let fs = require("fs");
let path = require("path");
let inputArr = process.argv.slice(2);
let inputCommand = inputArr[0];


let helpObj = require("./commandfolder/help");
let treeObj = require("./commandfolder/tree");
let organizeObj = require("./commandfolder/organize");
switch(inputCommand){
    case  "tree":
        treeObj.treefxn(inputArr[1]);
        break;
    case "organize":
        organizeObj.organizefxn(inputArr[1]);
        break;
    case "help":
        helpObj.helpfxn(inputArr[1]);
        break;
    default:
        console.log("🙏 enter correct command");

}
