package lb;

import android.database.Cursor;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f0 extends ka.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(int i13) {
        super(13, 14);
        this.f82591c = i13;
        switch (i13) {
            case 1:
                super(16, 17);
                break;
            case 2:
                super(17, 18);
                break;
            case 3:
                super(18, 19);
                break;
            case 4:
                super(20, 21);
                break;
            case 5:
                super(22, 23);
                break;
            case 6:
                super(12, 13);
                break;
            case 7:
                super(3, 4);
                break;
            case 8:
                super(4, 5);
                break;
            case 9:
                super(8, 9);
                break;
            case 10:
                super(9, 10);
                break;
            case 11:
                super(11, 12);
                break;
            case 12:
                super(1, 2);
                break;
            case 13:
                super(6, 7);
                break;
            case 14:
                super(7, 8);
                break;
            default:
                break;
        }
    }

    @Override // ka.b
    public final void a(pa.c database) {
        switch (this.f82591c) {
            case 0:
                database.B("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                database.B("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                database.B("DROP TABLE `WorkSpec`");
                database.B("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                database.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                database.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                break;
            case 1:
                database.B("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                database.B("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                database.B("DROP TABLE `WorkSpec`");
                database.B("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                database.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                database.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                break;
            case 2:
                database.B("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
                database.B("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
                break;
            case 3:
                database.B("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
                break;
            case 4:
                database.B("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
                break;
            case 5:
                database.B("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
                break;
            case 6:
                database.B("ALTER TABLE `idea_pin_drafts` ADD COLUMN `extracted_image_metadata` BLOB DEFAULT NULL");
                break;
            case 7:
                database.B("ALTER TABLE `idea_pin_drafts` ADD COLUMN `link` TEXT DEFAULT NULL");
                break;
            case 8:
                database.B("ALTER TABLE `idea_pin_drafts` ADD COLUMN `creationInspirationTopicId` TEXT DEFAULT NULL");
                break;
            case 9:
                database.B("ALTER TABLE `idea_pin_drafts` ADD COLUMN `duration` INTEGER NOT NULL DEFAULT 0");
                break;
            case 10:
                database.B("ALTER TABLE `idea_pin_drafts` ADD COLUMN `scheduled_date` INTEGER DEFAULT NULL");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(database, "database");
                database.B("CREATE TABLE IF NOT EXISTS `idea_pin_drafts_temp` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `metadata` TEXT NOT NULL, `page_data` TEXT, `tags` TEXT NOT NULL, `board_id` TEXT, `board_section_id` TEXT, `comment_reply_data` TEXT, `comments_enabled` INTEGER NOT NULL, `text_style_block_id` TEXT, `is_broken` INTEGER NOT NULL, `cover_image_path` TEXT, `page_count` INTEGER NOT NULL, `duration` INTEGER NOT NULL DEFAULT 0, `last_updated_at` INTEGER NOT NULL, `exported_media` TEXT NOT NULL, `link` TEXT, `created_at` INTEGER NOT NULL, `is_expiration_supported` INTEGER NOT NULL DEFAULT 0, `scheduled_date` INTEGER, PRIMARY KEY(`id`))");
                database.B("INSERT INTO `idea_pin_drafts_temp` (id, user_id, metadata, tags, board_id, board_section_id, comment_reply_data,comments_enabled, text_style_block_id, is_broken, cover_image_path, page_count, duration, last_updated_at, exported_media, link, created_at, is_expiration_supported, scheduled_date ) SELECT id, user_id, metadata, tags, board_id, board_section_id, comment_reply_data,comments_enabled, text_style_block_id, is_broken, cover_image_path, page_count, duration, last_updated_at, exported_media, link, created_at, is_expiration_supported, scheduled_date FROM `idea_pin_drafts`");
                nm.p pVar = new nm.p();
                Cursor c13 = database.c("SELECT * FROM `idea_pin_drafts`");
                if (c13.moveToFirst()) {
                    do {
                        String string = c13.getString(c13.getColumnIndexOrThrow("id"));
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        String string2 = c13.getString(c13.getColumnIndexOrThrow("page_list"));
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        nm.q qVar = (nm.q) pVar.a().b(nm.q.class, string2);
                        if (qVar.f91364a.isEmpty()) {
                            database.a("UPDATE `idea_pin_drafts_temp` SET `page_count` = ? WHERE `id` = ?", new Object[]{0, string});
                        } else {
                            String sVar = qVar.u(0).toString();
                            Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
                            database.a("UPDATE `idea_pin_drafts_temp` SET `page_data` = ? WHERE `id` = ?", new String[]{sVar, string});
                            database.a("UPDATE `idea_pin_drafts_temp` SET `page_count` = ? WHERE `id` = ?", new Object[]{1, string});
                        }
                    } while (c13.moveToNext());
                }
                database.B("DROP TABLE IF EXISTS `idea_pin_drafts`");
                database.B("ALTER TABLE idea_pin_drafts_temp RENAME TO `idea_pin_drafts`");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(database, "database");
                database.B("CREATE TABLE IF NOT EXISTS `network_speed` (`ideaPinPageId` TEXT NOT NULL, `uploadBucket` TEXT, `bytesWritten` INTEGER, `timestamp` INTEGER NOT NULL, `networkType` TEXT NOT NULL, `status` TEXT NOT NULL, `ideaPinCreationId` TEXT NOT NULL, `isVideo` INTEGER NOT NULL, PRIMARY KEY(`ideaPinPageId`))");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(database, "database");
                database.B("ALTER TABLE `idea_pin_drafts` ADD COLUMN `created_at` INTEGER NOT NULL DEFAULT 0");
                database.a("UPDATE `idea_pin_drafts` SET `created_at` = ?", new Long[]{Long.valueOf(new Date().getTime())});
                break;
            default:
                Intrinsics.checkNotNullParameter(database, "database");
                database.B("ALTER TABLE `idea_pin_drafts` ADD COLUMN `is_expiration_supported` INTEGER NOT NULL DEFAULT 0");
                break;
        }
    }
}
