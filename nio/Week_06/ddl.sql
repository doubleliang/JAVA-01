create TABLE IF NOT EXISTS `user` (
  `id` INT(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
`name` VARCHAR(18) NOT NULL COMMENT '姓名',
`phone_number` VARCHAR(40) NOT NULL COMMENT '手机号',
`create_time` DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '用户',
`update_time` DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '记录最后修改时间',
`update_by` VARCHAR(36) NOT NULL DEFAULT 'sys' COMMENT '记录最后操作人',
PRIMARY KEY (`id`),
KEY `key_phone_number` (`phone_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';

create TABLE IF NOT EXISTS `goods` (
  `id` INT(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
`name` VARCHAR(18) NOT NULL COMMENT '姓名',
`stock` INT(6) NOT NULL COMMENT '库存',
`price` DECIMAL(12) NOT NULL COMMENT '库存',
`img` VARCHAR(200) NOT NULL COMMENT '图片地址',
`gdesc` VARCHAR(225) NOT NULL COMMENT '商品描述',
`create_time` DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '用户',
`update_time` DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '记录最后修改时间',
`update_by` VARCHAR(36) NOT NULL DEFAULT 'sys' COMMENT '记录最后操作人',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品';

create TABLE IF NOT EXISTS `order` (
  `id` INT(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
`user_id` INT(10) unsigned NOT NULL COMMENT '用户id',
`goods_id` INT(10) unsigned NOT NULL COMMENT '商品id',
`price` DECIMAL(12) NOT NULL COMMENT '总价格',
`delivery_addr` VARCHAR(200) NOT NULL COMMENT '收货地址',
`delivery_phone` VARCHAR(15) NOT NULL COMMENT '收货手机号',
`create_time` DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '用户',
`update_time` DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '记录最后修改时间',
`update_by` VARCHAR(36) NOT NULL DEFAULT 'sys' COMMENT '记录最后操作人',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单';