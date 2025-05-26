package lb;

import androidx.lifecycle.n1;

/* loaded from: classes.dex */
public final class g0 extends ka.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82593c;

    /* renamed from: d, reason: collision with root package name */
    public final ka.a f82594d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(int i13) {
        super(14, 15);
        this.f82593c = i13;
        if (i13 == 1) {
            super(19, 20);
            this.f82594d = new n1();
            return;
        }
        if (i13 == 2) {
            super(10, 11);
            this.f82594d = new be0.a();
        } else if (i13 == 3) {
            super(2, 3);
            this.f82594d = new be0.a();
        } else if (i13 != 4) {
            this.f82594d = new bk.f();
        } else {
            super(5, 6);
            this.f82594d = new be0.a();
        }
    }

    @Override // ka.b
    public final void a(pa.c cVar) {
        int i13 = this.f82593c;
        ka.a aVar = this.f82594d;
        switch (i13) {
            case 0:
                cVar.B("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                cVar.B("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                cVar.B("DROP TABLE `WorkSpec`");
                cVar.B("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                cVar.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                cVar.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                aVar.G(cVar);
                break;
            case 1:
                cVar.B("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                cVar.B("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                cVar.B("DROP TABLE `WorkSpec`");
                cVar.B("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                cVar.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                cVar.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                aVar.G(cVar);
                break;
            case 2:
                cVar.B("CREATE TABLE IF NOT EXISTS `_new_idea_pin_drafts` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `metadata` TEXT NOT NULL, `page_list` TEXT NOT NULL, `tags` TEXT NOT NULL, `board_id` TEXT, `board_section_id` TEXT, `ctc_data` TEXT, `comment_reply_data` TEXT, `comments_enabled` INTEGER NOT NULL, `media_gallery_prefs` TEXT, `text_style_block_id` TEXT, `is_broken` INTEGER NOT NULL, `cover_image_path` TEXT, `page_count` INTEGER NOT NULL, `duration` INTEGER NOT NULL DEFAULT 0, `last_updated_at` INTEGER NOT NULL, `exported_media` TEXT NOT NULL, `link` TEXT, `created_at` INTEGER NOT NULL, `is_expiration_supported` INTEGER NOT NULL DEFAULT 0, `scheduled_date` INTEGER, PRIMARY KEY(`id`))");
                cVar.B("INSERT INTO `_new_idea_pin_drafts` (`id`,`user_id`,`metadata`,`page_list`,`tags`,`board_id`,`board_section_id`,`ctc_data`,`comment_reply_data`,`comments_enabled`,`media_gallery_prefs`,`text_style_block_id`,`is_broken`,`cover_image_path`,`page_count`,`duration`,`last_updated_at`,`exported_media`,`link`,`created_at`,`is_expiration_supported`,`scheduled_date`) SELECT `id`,`user_id`,`metadata`,`page_list`,`tags`,`board_id`,`board_section_id`,`ctc_data`,`comment_reply_data`,`comments_enabled`,`media_gallery_prefs`,`text_style_block_id`,`is_broken`,`cover_image_path`,`page_count`,`duration`,`last_updated_at`,`exported_media`,`link`,`created_at`,`is_expiration_supported`,`scheduled_date` FROM `idea_pin_drafts`");
                cVar.B("DROP TABLE `idea_pin_drafts`");
                cVar.B("ALTER TABLE `_new_idea_pin_drafts` RENAME TO `idea_pin_drafts`");
                aVar.G(cVar);
                break;
            case 3:
                cVar.B("CREATE TABLE IF NOT EXISTS `_new_idea_pin_drafts` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `metadata` TEXT NOT NULL, `page_list` TEXT NOT NULL, `tags` TEXT NOT NULL, `board_id` TEXT, `board_section_id` TEXT, `ctc_data` TEXT, `comment_reply_data` TEXT, `comments_enabled` INTEGER NOT NULL, `media_gallery_prefs` TEXT, `text_style_block_id` TEXT, `is_broken` INTEGER NOT NULL, `cover_image_path` TEXT, `page_count` INTEGER NOT NULL, `last_updated_at` INTEGER NOT NULL, `exported_media` TEXT NOT NULL, PRIMARY KEY(`id`))");
                cVar.B("INSERT INTO `_new_idea_pin_drafts` (`id`,`user_id`,`metadata`,`page_list`,`tags`,`board_id`,`board_section_id`,`ctc_data`,`comment_reply_data`,`comments_enabled`,`media_gallery_prefs`,`text_style_block_id`,`is_broken`,`cover_image_path`,`page_count`,`last_updated_at`,`exported_media`) SELECT `id`,`user_id`,`metadata`,`page_list`,`tags`,`board_id`,`board_section_id`,`ctc_data`,`comment_reply_data`,`comments_enabled`,`media_gallery_prefs`,`text_style_block_id`,`is_broken`,`cover_image_path`,`page_count`,`last_updated_at`,`exported_media` FROM `idea_pin_drafts`");
                cVar.B("DROP TABLE `idea_pin_drafts`");
                cVar.B("ALTER TABLE `_new_idea_pin_drafts` RENAME TO `idea_pin_drafts`");
                aVar.G(cVar);
                break;
            default:
                cVar.B("CREATE TABLE IF NOT EXISTS `_new_idea_pin_recently_used_content` (`content_id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `last_used_timestamp` INTEGER NOT NULL, `content_type` TEXT NOT NULL DEFAULT 'stickers', PRIMARY KEY(`content_id`, `user_id`))");
                cVar.B("INSERT INTO `_new_idea_pin_recently_used_content` (`content_id`,`user_id`,`last_used_timestamp`) SELECT `sticker_id`,`user_id`,`last_used_timestamp` FROM `idea_pin_recently_used_stickers`");
                cVar.B("DROP TABLE `idea_pin_recently_used_stickers`");
                cVar.B("ALTER TABLE `_new_idea_pin_recently_used_content` RENAME TO `idea_pin_recently_used_content`");
                aVar.G(cVar);
                break;
        }
    }
}
