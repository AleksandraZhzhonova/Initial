$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Scenario2.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: ru"
    }
  ],
  "line": 3,
  "name": "создание нового актива типа \"Денежные средства\" для ФО типа КО",
  "description": "",
  "id": "создание-нового-актива-типа-\"денежные-средства\"-для-фо-типа-ко",
  "keyword": "Функционал"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Предыстория"
});
formatter.step({
  "line": 6,
  "name": "открыт браузер и осуществлен переход по ссылке",
  "keyword": "Дано "
});
formatter.step({
  "line": 7,
  "name": "открывается страница с формой \"Вход в систему\"",
  "keyword": "И "
});
formatter.match({
  "location": "InitialSteps.openBrowser()"
});
formatter.result({
  "duration": 4231436850,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Вход в систему",
      "offset": 31
    }
  ],
  "location": "InitialSteps.openStartPage(String)"
});
formatter.result({
  "duration": 1079295676,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 8,
      "value": "#  В системе существует действительный счет с маской \"202\""
    }
  ],
  "line": 11,
  "name": "аутентификация с валидными данными",
  "description": "",
  "id": "создание-нового-актива-типа-\"денежные-средства\"-для-фо-типа-ко;аутентификация-с-валидными-данными",
  "type": "scenario",
  "keyword": "Сценарий",
  "tags": [
    {
      "line": 10,
      "name": "@11114"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "пользователь заполняет поле \"Имя пользователя\" значением \"sua_all\"",
  "keyword": "Когда "
});
formatter.step({
  "line": 13,
  "name": "пользователь вводит в поле \"Пароль\" значение \"Q1w2e3r4\"",
  "keyword": "И "
});
formatter.step({
  "line": 14,
  "name": "пользователь нажимает кнопку \"Войти\"",
  "keyword": "И "
});
formatter.step({
  "line": 15,
  "name": "открывается модальное окно \"Выбор финансовой организации\"",
  "keyword": "Тогда "
});
formatter.step({
  "line": 16,
  "name": "пользователь выбирает финансовую организацию \"10\" типа КО",
  "keyword": "Тогда "
});
formatter.step({
  "line": 17,
  "name": "пользователь нажимает кнопку \"Выбрать\"",
  "keyword": "И "
});
formatter.step({
  "line": 18,
  "name": "открывается окно с логотипом \"Агентство по страхованию вкладов\"",
  "keyword": "Тогда "
});
formatter.step({
  "line": 19,
  "name": "открывается страница с финансовой организацией \"10\"",
  "keyword": "Тогда "
});
formatter.step({
  "line": 20,
  "name": "пользователь нажимает кнопку с выпадающим списком \"Сбор и ведение данных\"",
  "keyword": "И "
});
formatter.step({
  "line": 21,
  "name": "пользователь выбирает пункт \"Список активов\" в выпадающем списке панели навигации",
  "keyword": "И "
});
formatter.step({
  "line": 24,
  "name": "пользователь нажимает кнопку \"Создать\"",
  "keyword": "И "
});
formatter.step({
  "line": 25,
  "name": "открывается страница \"Создание актива (первый этап)\"",
  "keyword": "Тогда "
});
formatter.step({
  "line": 26,
  "name": "пользователь выбирает пункт \"Денежные средства\" в выпадающем списке \"Тип актива функциональный\"",
  "keyword": "И "
});
formatter.step({
  "line": 27,
  "name": "пользователь нажимает кнопку \"Далее\"",
  "keyword": "Тогда "
});
formatter.step({
  "line": 28,
  "name": "На странице присутствуют вкладки",
  "rows": [
    {
      "cells": [
        "Основная информация"
      ],
      "line": 29
    },
    {
      "cells": [
        "Приём"
      ],
      "line": 30
    },
    {
      "cells": [
        "План работы"
      ],
      "line": 31
    },
    {
      "cells": [
        "Судебная работа"
      ],
      "line": 32
    },
    {
      "cells": [
        "Инвентаризация"
      ],
      "line": 33
    },
    {
      "cells": [
        "Хранение"
      ],
      "line": 34
    },
    {
      "cells": [
        "Аренда"
      ],
      "line": 35
    },
    {
      "cells": [
        "Оценка"
      ],
      "line": 36
    },
    {
      "cells": [
        "Реализация"
      ],
      "line": 37
    },
    {
      "cells": [
        "Списание"
      ],
      "line": 38
    },
    {
      "cells": [
        "Утилизация"
      ],
      "line": 39
    },
    {
      "cells": [
        "Связи с активами"
      ],
      "line": 40
    },
    {
      "cells": [
        "Вовлечённые стороны"
      ],
      "line": 41
    }
  ],
  "keyword": "И "
});
formatter.step({
  "comments": [
    {
      "line": 44,
      "value": "#проверка всех вкладок"
    },
    {
      "line": 45,
      "value": "#тогда открывается форма"
    }
  ],
  "line": 46,
  "name": "пользователь вводит в поле \"Начальная балансовая стоимость\" значение \"1256\" таблицы \"Создание актива второй этап\"",
  "keyword": "Тогда "
});
formatter.step({
  "line": 47,
  "name": "пользователь нажимает кнопку \"Права  Все\"",
  "keyword": "И "
});
formatter.step({
  "line": 48,
  "name": "пользователь нажимает кнопку \"Выход\" в контекстном меню",
  "keyword": "И "
});
formatter.step({
  "line": 49,
  "name": "браузер закрыт",
  "keyword": "И "
});
formatter.match({
  "arguments": [
    {
      "val": "sua_all",
      "offset": 58
    }
  ],
  "location": "StepImplementation.userFillsLoginField(String)"
});
formatter.result({
  "duration": 78262361,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Q1w2e3r4",
      "offset": 46
    }
  ],
  "location": "StepImplementation.userFillsPasswordField(String)"
});
formatter.result({
  "duration": 79130418,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Войти",
      "offset": 30
    }
  ],
  "location": "StepImplementation.пользователь_нажимает_кнопку(String)"
});
formatter.result({
  "duration": 1148632894,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Выбор финансовой организации",
      "offset": 28
    }
  ],
  "location": "StepImplementation.openPageChooseFinOrg(String)"
});
formatter.result({
  "duration": 1060297597,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 46
    }
  ],
  "location": "StepImplementation.пользователь_нажимает_кнопку(String)"
});
formatter.result({
  "duration": 62398780,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Выбрать",
      "offset": 30
    }
  ],
  "location": "StepImplementation.пользователь_нажимает_кнопку(String)"
});
formatter.result({
  "duration": 66111980,
  "status": "passed"
});
formatter.match({
  "location": "StepImplementation.openPage()"
});
formatter.result({
  "duration": 1068845351,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 48
    }
  ],
  "location": "StepImplementation.checkFinOrg(String)"
});
formatter.result({
  "duration": 1058764602,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Сбор и ведение данных",
      "offset": 51
    }
  ],
  "location": "StepImplementation.пользователь_нажимает_кнопку_с_выпадающим_списком(String)"
});
formatter.result({
  "duration": 2090965306,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Список активов",
      "offset": 29
    }
  ],
  "location": "StepImplementation.chooseNavigationOption(String)"
});
formatter.result({
  "duration": 2081950322,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Создать",
      "offset": 30
    }
  ],
  "location": "StepImplementation.пользователь_нажимает_кнопку(String)"
});
formatter.result({
  "duration": 109475122,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Создание актива (первый этап)",
      "offset": 22
    }
  ],
  "location": "StepImplementation.checkFinOrg(String)"
});
formatter.result({
  "duration": 1060839944,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Денежные средства",
      "offset": 29
    }
  ],
  "location": "StepImplementation.пользователь_выбирает_пункт_в_выпадающем_списке(String)"
});
formatter.result({
  "duration": 48631272,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Далее",
      "offset": 30
    }
  ],
  "location": "StepImplementation.пользователь_нажимает_кнопку(String)"
});
formatter.result({
  "duration": 83814435,
  "status": "passed"
});
formatter.match({
  "location": "StepImplementation.на_странице_присутствуют_вкладки(DataTable)"
});
formatter.result({
  "duration": 1329003769,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Начальная балансовая стоимость",
      "offset": 28
    },
    {
      "val": "1256",
      "offset": 70
    }
  ],
  "location": "StepImplementation.enterValueToForm(String,String)"
});
formatter.result({
  "duration": 136976184,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Права  Все",
      "offset": 30
    }
  ],
  "location": "StepImplementation.пользователь_нажимает_кнопку(String)"
});
formatter.result({
  "duration": 78999713,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Выход",
      "offset": 30
    }
  ],
  "location": "StepImplementation.пользователь_нажимает_кнопку(String)"
});
formatter.result({
  "duration": 76911151,
  "status": "passed"
});
formatter.match({
  "location": "InitialSteps.браузер_закрыт()"
});
formatter.result({
  "duration": 613821412,
  "status": "passed"
});
});