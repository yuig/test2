package lb;

import androidx.work.impl.WorkDatabase_Impl;
import com.pinterest.database.PinterestDatabase_Impl;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import com.pinterest.typeaheadroom.AppDatabase_Impl;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h0 extends e7.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82596c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ja.d0 f82597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(ja.d0 d0Var, int i13, int i14) {
        super(i13, 2);
        this.f82596c = i14;
        this.f82597d = d0Var;
    }

    @Override // e7.e
    public final void f(pa.c cVar) {
        switch (this.f82596c) {
            case 0:
                cVar.B("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                cVar.B("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                cVar.B("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                cVar.B("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                cVar.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                cVar.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                cVar.B("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                cVar.B("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                cVar.B("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                cVar.B("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                cVar.B("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                cVar.B("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                cVar.B("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                cVar.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
                break;
            case 1:
                cVar.B("CREATE TABLE IF NOT EXISTS `idea_pin_font` (`id` TEXT NOT NULL, `key` TEXT NOT NULL, `type` INTEGER NOT NULL, `lineHeight` REAL NOT NULL, `name` TEXT NOT NULL, `path` TEXT NOT NULL, PRIMARY KEY(`id`))");
                cVar.B("CREATE TABLE IF NOT EXISTS `idea_pin_drafts` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `metadata` TEXT NOT NULL, `page_data` TEXT, `tags` TEXT NOT NULL, `board_id` TEXT, `board_section_id` TEXT, `comment_reply_data` TEXT, `comments_enabled` INTEGER NOT NULL, `text_style_block_id` TEXT, `extracted_image_metadata` BLOB, `is_broken` INTEGER NOT NULL, `cover_image_path` TEXT, `page_count` INTEGER NOT NULL, `duration` INTEGER NOT NULL DEFAULT 0, `last_updated_at` INTEGER NOT NULL, `exported_media` TEXT NOT NULL, `link` TEXT, `created_at` INTEGER NOT NULL, `is_expiration_supported` INTEGER NOT NULL DEFAULT 0, `scheduled_date` INTEGER, PRIMARY KEY(`id`))");
                cVar.B("CREATE TABLE IF NOT EXISTS `idea_pin_recently_used_content` (`content_id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `last_used_timestamp` INTEGER NOT NULL, `content_type` TEXT NOT NULL DEFAULT 'stickers', PRIMARY KEY(`content_id`, `user_id`))");
                cVar.B("CREATE TABLE IF NOT EXISTS `network_speed` (`ideaPinPageId` TEXT NOT NULL, `uploadBucket` TEXT, `bytesWritten` INTEGER, `timestamp` INTEGER NOT NULL, `networkType` TEXT NOT NULL, `status` TEXT NOT NULL, `ideaPinCreationId` TEXT NOT NULL, `isVideo` INTEGER NOT NULL, PRIMARY KEY(`ideaPinPageId`))");
                cVar.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bbfbd7ca46a44b6d1e8249b9365b3a0a')");
                break;
            default:
                cVar.B("CREATE TABLE IF NOT EXISTS `SearchTypeaheadSuggestionRoom` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `suggestion` TEXT NOT NULL, `score` REAL NOT NULL)");
                cVar.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '67a542dce72d8ccb2fedef1b9ef7bd2f')");
                break;
        }
    }

    @Override // e7.e
    public final void g(pa.c db3) {
        int i13 = this.f82596c;
        ja.d0 d0Var = this.f82597d;
        switch (i13) {
            case 0:
                db3.B("DROP TABLE IF EXISTS `Dependency`");
                db3.B("DROP TABLE IF EXISTS `WorkSpec`");
                db3.B("DROP TABLE IF EXISTS `WorkTag`");
                db3.B("DROP TABLE IF EXISTS `SystemIdInfo`");
                db3.B("DROP TABLE IF EXISTS `WorkName`");
                db3.B("DROP TABLE IF EXISTS `WorkProgress`");
                db3.B("DROP TABLE IF EXISTS `Preference`");
                List list = ((WorkDatabase_Impl) d0Var).f75184g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).getClass();
                        Intrinsics.checkNotNullParameter(db3, "db");
                    }
                    break;
                }
                break;
            case 1:
                db3.B("DROP TABLE IF EXISTS `idea_pin_font`");
                db3.B("DROP TABLE IF EXISTS `idea_pin_drafts`");
                db3.B("DROP TABLE IF EXISTS `idea_pin_recently_used_content`");
                db3.B("DROP TABLE IF EXISTS `network_speed`");
                List list2 = ((PinterestDatabase_Impl) d0Var).f75184g;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((a) it2.next()).getClass();
                        Intrinsics.checkNotNullParameter(db3, "db");
                    }
                    break;
                }
                break;
            default:
                db3.B("DROP TABLE IF EXISTS `SearchTypeaheadSuggestionRoom`");
                List list3 = ((AppDatabase_Impl) d0Var).f75184g;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((a) it3.next()).getClass();
                        Intrinsics.checkNotNullParameter(db3, "db");
                    }
                    break;
                }
                break;
        }
    }

    @Override // e7.e
    public final void j(pa.c db3) {
        int i13 = this.f82596c;
        ja.d0 d0Var = this.f82597d;
        switch (i13) {
            case 0:
                List list = ((WorkDatabase_Impl) d0Var).f75184g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).getClass();
                        Intrinsics.checkNotNullParameter(db3, "db");
                    }
                    break;
                }
                break;
            case 1:
                List list2 = ((PinterestDatabase_Impl) d0Var).f75184g;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((a) it2.next()).getClass();
                        Intrinsics.checkNotNullParameter(db3, "db");
                    }
                    break;
                }
                break;
            default:
                List list3 = ((AppDatabase_Impl) d0Var).f75184g;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((a) it3.next()).getClass();
                        Intrinsics.checkNotNullParameter(db3, "db");
                    }
                    break;
                }
                break;
        }
    }

    @Override // e7.e
    public final void k(pa.c cVar) {
        switch (this.f82596c) {
            case 0:
                ((WorkDatabase_Impl) this.f82597d).f75178a = cVar;
                cVar.B("PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) this.f82597d).n(cVar);
                List list = ((WorkDatabase_Impl) this.f82597d).f75184g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a(cVar);
                    }
                    break;
                }
                break;
            case 1:
                ((PinterestDatabase_Impl) this.f82597d).f75178a = cVar;
                ((PinterestDatabase_Impl) this.f82597d).n(cVar);
                List list2 = ((PinterestDatabase_Impl) this.f82597d).f75184g;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((a) it2.next()).a(cVar);
                    }
                    break;
                }
                break;
            default:
                ((AppDatabase_Impl) this.f82597d).f75178a = cVar;
                ((AppDatabase_Impl) this.f82597d).n(cVar);
                List list3 = ((AppDatabase_Impl) this.f82597d).f75184g;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((a) it3.next()).a(cVar);
                    }
                    break;
                }
                break;
        }
    }

    @Override // e7.e
    public final void l(pa.c cVar) {
        switch (this.f82596c) {
            case 0:
                d7.b.B(cVar);
                break;
            case 1:
                d7.b.B(cVar);
                break;
            default:
                d7.b.B(cVar);
                break;
        }
    }

    @Override // e7.e
    public final androidx.appcompat.app.x0 m(pa.c cVar) {
        switch (this.f82596c) {
            case 0:
                HashMap hashMap = new HashMap(2);
                hashMap.put("work_spec_id", new la.a(1, 1, "work_spec_id", "TEXT", null, true));
                hashMap.put("prerequisite_id", new la.a(2, 1, "prerequisite_id", "TEXT", null, true));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new la.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                hashSet.add(new la.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new la.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
                hashSet2.add(new la.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), Arrays.asList("ASC"), false));
                la.e eVar = new la.e("Dependency", hashMap, hashSet, hashSet2);
                la.e a13 = la.e.a(cVar, "Dependency");
                if (!eVar.equals(a13)) {
                    break;
                } else {
                    HashMap hashMap2 = new HashMap(32);
                    hashMap2.put("id", new la.a(1, 1, "id", "TEXT", null, true));
                    hashMap2.put(AnimatedTarget.PROPERTY_STATE, new la.a(0, 1, AnimatedTarget.PROPERTY_STATE, "INTEGER", null, true));
                    hashMap2.put("worker_class_name", new la.a(0, 1, "worker_class_name", "TEXT", null, true));
                    hashMap2.put("input_merger_class_name", new la.a(0, 1, "input_merger_class_name", "TEXT", null, true));
                    hashMap2.put("input", new la.a(0, 1, "input", "BLOB", null, true));
                    hashMap2.put("output", new la.a(0, 1, "output", "BLOB", null, true));
                    hashMap2.put("initial_delay", new la.a(0, 1, "initial_delay", "INTEGER", null, true));
                    hashMap2.put("interval_duration", new la.a(0, 1, "interval_duration", "INTEGER", null, true));
                    hashMap2.put("flex_duration", new la.a(0, 1, "flex_duration", "INTEGER", null, true));
                    hashMap2.put("run_attempt_count", new la.a(0, 1, "run_attempt_count", "INTEGER", null, true));
                    hashMap2.put("backoff_policy", new la.a(0, 1, "backoff_policy", "INTEGER", null, true));
                    hashMap2.put("backoff_delay_duration", new la.a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
                    hashMap2.put("last_enqueue_time", new la.a(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
                    hashMap2.put("minimum_retention_duration", new la.a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
                    hashMap2.put("schedule_requested_at", new la.a(0, 1, "schedule_requested_at", "INTEGER", null, true));
                    hashMap2.put("run_in_foreground", new la.a(0, 1, "run_in_foreground", "INTEGER", null, true));
                    hashMap2.put("out_of_quota_policy", new la.a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
                    hashMap2.put("period_count", new la.a(0, 1, "period_count", "INTEGER", "0", true));
                    hashMap2.put("generation", new la.a(0, 1, "generation", "INTEGER", "0", true));
                    hashMap2.put("next_schedule_time_override", new la.a(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
                    hashMap2.put("next_schedule_time_override_generation", new la.a(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
                    hashMap2.put("stop_reason", new la.a(0, 1, "stop_reason", "INTEGER", "-256", true));
                    hashMap2.put("trace_tag", new la.a(0, 1, "trace_tag", "TEXT", null, false));
                    hashMap2.put("required_network_type", new la.a(0, 1, "required_network_type", "INTEGER", null, true));
                    hashMap2.put("required_network_request", new la.a(0, 1, "required_network_request", "BLOB", "x''", true));
                    hashMap2.put("requires_charging", new la.a(0, 1, "requires_charging", "INTEGER", null, true));
                    hashMap2.put("requires_device_idle", new la.a(0, 1, "requires_device_idle", "INTEGER", null, true));
                    hashMap2.put("requires_battery_not_low", new la.a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
                    hashMap2.put("requires_storage_not_low", new la.a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
                    hashMap2.put("trigger_content_update_delay", new la.a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
                    hashMap2.put("trigger_max_content_delay", new la.a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
                    hashMap2.put("content_uri_triggers", new la.a(0, 1, "content_uri_triggers", "BLOB", null, true));
                    HashSet hashSet3 = new HashSet(0);
                    HashSet hashSet4 = new HashSet(2);
                    hashSet4.add(new la.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), Arrays.asList("ASC"), false));
                    hashSet4.add(new la.d("index_WorkSpec_last_enqueue_time", Arrays.asList("last_enqueue_time"), Arrays.asList("ASC"), false));
                    la.e eVar2 = new la.e("WorkSpec", hashMap2, hashSet3, hashSet4);
                    la.e a14 = la.e.a(cVar, "WorkSpec");
                    if (!eVar2.equals(a14)) {
                        break;
                    } else {
                        HashMap hashMap3 = new HashMap(2);
                        hashMap3.put("tag", new la.a(1, 1, "tag", "TEXT", null, true));
                        hashMap3.put("work_spec_id", new la.a(2, 1, "work_spec_id", "TEXT", null, true));
                        HashSet hashSet5 = new HashSet(1);
                        hashSet5.add(new la.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                        HashSet hashSet6 = new HashSet(1);
                        hashSet6.add(new la.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
                        la.e eVar3 = new la.e("WorkTag", hashMap3, hashSet5, hashSet6);
                        la.e a15 = la.e.a(cVar, "WorkTag");
                        if (!eVar3.equals(a15)) {
                            break;
                        } else {
                            HashMap hashMap4 = new HashMap(3);
                            hashMap4.put("work_spec_id", new la.a(1, 1, "work_spec_id", "TEXT", null, true));
                            hashMap4.put("generation", new la.a(2, 1, "generation", "INTEGER", "0", true));
                            hashMap4.put("system_id", new la.a(0, 1, "system_id", "INTEGER", null, true));
                            HashSet hashSet7 = new HashSet(1);
                            hashSet7.add(new la.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                            la.e eVar4 = new la.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                            la.e a16 = la.e.a(cVar, "SystemIdInfo");
                            if (!eVar4.equals(a16)) {
                                break;
                            } else {
                                HashMap hashMap5 = new HashMap(2);
                                hashMap5.put("name", new la.a(1, 1, "name", "TEXT", null, true));
                                hashMap5.put("work_spec_id", new la.a(2, 1, "work_spec_id", "TEXT", null, true));
                                HashSet hashSet8 = new HashSet(1);
                                hashSet8.add(new la.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                                HashSet hashSet9 = new HashSet(1);
                                hashSet9.add(new la.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
                                la.e eVar5 = new la.e("WorkName", hashMap5, hashSet8, hashSet9);
                                la.e a17 = la.e.a(cVar, "WorkName");
                                if (!eVar5.equals(a17)) {
                                    break;
                                } else {
                                    HashMap hashMap6 = new HashMap(2);
                                    hashMap6.put("work_spec_id", new la.a(1, 1, "work_spec_id", "TEXT", null, true));
                                    hashMap6.put("progress", new la.a(0, 1, "progress", "BLOB", null, true));
                                    HashSet hashSet10 = new HashSet(1);
                                    hashSet10.add(new la.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                                    la.e eVar6 = new la.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
                                    la.e a18 = la.e.a(cVar, "WorkProgress");
                                    if (!eVar6.equals(a18)) {
                                        break;
                                    } else {
                                        HashMap hashMap7 = new HashMap(2);
                                        hashMap7.put("key", new la.a(1, 1, "key", "TEXT", null, true));
                                        hashMap7.put("long_value", new la.a(0, 1, "long_value", "INTEGER", null, false));
                                        la.e eVar7 = new la.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
                                        la.e a19 = la.e.a(cVar, "Preference");
                                        if (!eVar7.equals(a19)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            case 1:
                HashMap hashMap8 = new HashMap(6);
                hashMap8.put("id", new la.a(1, 1, "id", "TEXT", null, true));
                hashMap8.put("key", new la.a(0, 1, "key", "TEXT", null, true));
                hashMap8.put("type", new la.a(0, 1, "type", "INTEGER", null, true));
                hashMap8.put("lineHeight", new la.a(0, 1, "lineHeight", "REAL", null, true));
                hashMap8.put("name", new la.a(0, 1, "name", "TEXT", null, true));
                hashMap8.put("path", new la.a(0, 1, "path", "TEXT", null, true));
                la.e eVar8 = new la.e("idea_pin_font", hashMap8, new HashSet(0), new HashSet(0));
                la.e a23 = la.e.a(cVar, "idea_pin_font");
                if (!eVar8.equals(a23)) {
                    break;
                } else {
                    HashMap hashMap9 = new HashMap(21);
                    hashMap9.put("id", new la.a(1, 1, "id", "TEXT", null, true));
                    hashMap9.put("user_id", new la.a(0, 1, "user_id", "TEXT", null, true));
                    hashMap9.put("metadata", new la.a(0, 1, "metadata", "TEXT", null, true));
                    hashMap9.put("page_data", new la.a(0, 1, "page_data", "TEXT", null, false));
                    hashMap9.put("tags", new la.a(0, 1, "tags", "TEXT", null, true));
                    hashMap9.put("board_id", new la.a(0, 1, "board_id", "TEXT", null, false));
                    hashMap9.put("board_section_id", new la.a(0, 1, "board_section_id", "TEXT", null, false));
                    hashMap9.put("comment_reply_data", new la.a(0, 1, "comment_reply_data", "TEXT", null, false));
                    hashMap9.put("comments_enabled", new la.a(0, 1, "comments_enabled", "INTEGER", null, true));
                    hashMap9.put("text_style_block_id", new la.a(0, 1, "text_style_block_id", "TEXT", null, false));
                    hashMap9.put("extracted_image_metadata", new la.a(0, 1, "extracted_image_metadata", "BLOB", null, false));
                    hashMap9.put("is_broken", new la.a(0, 1, "is_broken", "INTEGER", null, true));
                    hashMap9.put("cover_image_path", new la.a(0, 1, "cover_image_path", "TEXT", null, false));
                    hashMap9.put("page_count", new la.a(0, 1, "page_count", "INTEGER", null, true));
                    hashMap9.put("duration", new la.a(0, 1, "duration", "INTEGER", "0", true));
                    hashMap9.put("last_updated_at", new la.a(0, 1, "last_updated_at", "INTEGER", null, true));
                    hashMap9.put("exported_media", new la.a(0, 1, "exported_media", "TEXT", null, true));
                    hashMap9.put("link", new la.a(0, 1, "link", "TEXT", null, false));
                    hashMap9.put("created_at", new la.a(0, 1, "created_at", "INTEGER", null, true));
                    hashMap9.put("is_expiration_supported", new la.a(0, 1, "is_expiration_supported", "INTEGER", "0", true));
                    hashMap9.put("scheduled_date", new la.a(0, 1, "scheduled_date", "INTEGER", null, false));
                    la.e eVar9 = new la.e("idea_pin_drafts", hashMap9, new HashSet(0), new HashSet(0));
                    la.e a24 = la.e.a(cVar, "idea_pin_drafts");
                    if (!eVar9.equals(a24)) {
                        break;
                    } else {
                        HashMap hashMap10 = new HashMap(4);
                        hashMap10.put("content_id", new la.a(1, 1, "content_id", "TEXT", null, true));
                        hashMap10.put("user_id", new la.a(2, 1, "user_id", "TEXT", null, true));
                        hashMap10.put("last_used_timestamp", new la.a(0, 1, "last_used_timestamp", "INTEGER", null, true));
                        hashMap10.put("content_type", new la.a(0, 1, "content_type", "TEXT", "'stickers'", true));
                        la.e eVar10 = new la.e("idea_pin_recently_used_content", hashMap10, new HashSet(0), new HashSet(0));
                        la.e a25 = la.e.a(cVar, "idea_pin_recently_used_content");
                        if (!eVar10.equals(a25)) {
                            break;
                        } else {
                            HashMap hashMap11 = new HashMap(8);
                            hashMap11.put("ideaPinPageId", new la.a(1, 1, "ideaPinPageId", "TEXT", null, true));
                            hashMap11.put("uploadBucket", new la.a(0, 1, "uploadBucket", "TEXT", null, false));
                            hashMap11.put("bytesWritten", new la.a(0, 1, "bytesWritten", "INTEGER", null, false));
                            hashMap11.put("timestamp", new la.a(0, 1, "timestamp", "INTEGER", null, true));
                            hashMap11.put("networkType", new la.a(0, 1, "networkType", "TEXT", null, true));
                            hashMap11.put("status", new la.a(0, 1, "status", "TEXT", null, true));
                            hashMap11.put("ideaPinCreationId", new la.a(0, 1, "ideaPinCreationId", "TEXT", null, true));
                            hashMap11.put("isVideo", new la.a(0, 1, "isVideo", "INTEGER", null, true));
                            la.e eVar11 = new la.e("network_speed", hashMap11, new HashSet(0), new HashSet(0));
                            la.e a26 = la.e.a(cVar, "network_speed");
                            if (!eVar11.equals(a26)) {
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                }
            default:
                HashMap hashMap12 = new HashMap(3);
                hashMap12.put("id", new la.a(1, 1, "id", "INTEGER", null, true));
                hashMap12.put("suggestion", new la.a(0, 1, "suggestion", "TEXT", null, true));
                hashMap12.put("score", new la.a(0, 1, "score", "REAL", null, true));
                la.e eVar12 = new la.e("SearchTypeaheadSuggestionRoom", hashMap12, new HashSet(0), new HashSet(0));
                la.e a27 = la.e.a(cVar, "SearchTypeaheadSuggestionRoom");
                if (!eVar12.equals(a27)) {
                    break;
                } else {
                    break;
                }
        }
        return new androidx.appcompat.app.x0(true, (Serializable) null);
    }
}
