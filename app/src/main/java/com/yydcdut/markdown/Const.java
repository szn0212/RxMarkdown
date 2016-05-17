package com.yydcdut.markdown;

import android.os.Environment;

import java.io.File;

/**
 * Created by yuyidong on 16/5/11.
 */
public interface Const {

    String MD_SAMPLE = "在这个**版本**中我们*增加test*了 `Markdown` 功能。`Markdown` 是~~一种使用纯文本编写的标记~~语言，可以产生格式![test](http://static.yo9.com/web/emotions/tv_sad.png)丰富的页面[^排版效果]，比如突出[标题](http://www.baidu.com)、居中、加粗、引用和生成列表。\n" +
            "\n" +
            "## **用法与规则：**\n" +
//                    "\n" +
//                    "你可以手动输入，也可以点击键盘上方的按钮快速输入 Markdown 符号。\n" +
            "\n" +
            "### **标题**\n" +
            "使用“#”加空格在*行首*来创建标题\n" +
            "***\n" +
            "\n" +
            "```\n" +
            "test1\n" +
            "test2\n" +
            "test3\n" +
            "test4\n" +
            "```\n" +
            "\n" +
            "- [ ] 123\n" +
            "- [ ] 456\n" +
            "- [ ] 789\n" +
            "\n" +
            "- [x] 987\n" +
            "- [x] 654\n" +
            "- [x] 321\n" +
            "\n" +
            "例如：\n" +
            "# 一级标题\n" +
            "## 二级标题\n" +
            "### 三级标题\n" +
            "---\n" +
            "![test](file://" + Environment.getExternalStorageDirectory() + File.separator + "tv_cheers.png" + ")\n" +
            "### **加粗功能**\n" +
            "使用一组星号“**”来加粗一段文字\n" +
            "\n" +
            "```\n" +
            "test1\n" +
            "test2\n" +
            "test3\n" +
            "test4\n" +
            "```" +
            "例如：\n" +
            "这是**加粗的文字**\n" +
            "\n" +
            "### **居中**\n" +
            "使用一对中括号“[文字]”来居中一段文字，也可以和标题叠加使用\n" +
            "\n" +
            "例如：\n" +
            "[### 这是一个居中的标题]\n" +
            "\n" +
            "### **引用**\n" +
            "使用“> ”在段首来引用一段文字\n" +
            "\n" +
            "例如：\n" +
            "> 这是一段引用\n" +
            "> 这是一段引用\n" +
            "\n" +
            "### **无序列表**\n" +
            "使用 “-”、“*”或“+”加空格 来创建无序列表\n" +
            "\n" +
            "例如：\n" +
            "- 这是一个无序列表\n" +
            "+ 这是一个无序列表\n" +
            "* 这是一个无序列表\n" +
            "\n" +
            "### **有序列表**\n" +
            "使用 数字圆点加空格 如“1. ”、“2. ”来创建有序列表\n" +
            "\n" +
            "例如：\n" +
            "1. 这是一个有序列表\n" +
            "2. 这是一个有序列表\n" +
            "3. 这是一个有序列表";

}
