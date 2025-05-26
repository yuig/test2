package u71;

import androidx.appcompat.app.x0;
import com.pinterest.feature.search.visual.collage.database.CollageDatabase_Impl;
import e7.e;
import info.mqtt.android.service.room.MqMessageDatabase_Impl;
import ja.d0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import la.d;
import pa.c;

/* loaded from: classes5.dex */
public final class b extends e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f120902c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f120903d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d0 d0Var, int i13, int i14) {
        super(i13, 2);
        this.f120902c = i14;
        this.f120903d = d0Var;
    }

    @Override // e7.e
    public final void f(c cVar) {
        switch (this.f120902c) {
            case 0:
                cVar.B("CREATE TABLE IF NOT EXISTS `collage_drafts` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `last_updated_at` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                cVar.B("CREATE TABLE IF NOT EXISTS `collage_page` (`id` TEXT NOT NULL, `draft_id` TEXT NOT NULL, `background_image` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`draft_id`) REFERENCES `collage_drafts`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                cVar.B("CREATE INDEX IF NOT EXISTS `index_collage_page_draft_id` ON `collage_page` (`draft_id`)");
                cVar.B("CREATE TABLE IF NOT EXISTS `collage_item` (`id` TEXT NOT NULL, `overlay_item` TEXT NOT NULL, `page_id` TEXT NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`page_id`) REFERENCES `collage_page`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                cVar.B("CREATE INDEX IF NOT EXISTS `index_collage_item_page_id` ON `collage_item` (`page_id`)");
                cVar.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c38068b28b1318e569fdbd673ad2ccd6')");
                break;
            default:
                cVar.B("CREATE TABLE IF NOT EXISTS `MqMessageEntity` (`messageId` TEXT NOT NULL, `clientHandle` TEXT NOT NULL, `topic` TEXT NOT NULL, `mqttMessage` TEXT NOT NULL, `qos` INTEGER NOT NULL, `retained` INTEGER NOT NULL, `duplicate` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`messageId`))");
                cVar.B("CREATE INDEX IF NOT EXISTS `index_MqMessageEntity_clientHandle` ON `MqMessageEntity` (`clientHandle`)");
                cVar.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1569b25bb8b179d5ea5abec331608dd1')");
                break;
        }
    }

    @Override // e7.e
    public final void g(c db3) {
        int i13 = this.f120902c;
        d0 d0Var = this.f120903d;
        switch (i13) {
            case 0:
                db3.B("DROP TABLE IF EXISTS `collage_drafts`");
                db3.B("DROP TABLE IF EXISTS `collage_page`");
                db3.B("DROP TABLE IF EXISTS `collage_item`");
                List list = ((CollageDatabase_Impl) d0Var).f75184g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((lb.a) it.next()).getClass();
                        Intrinsics.checkNotNullParameter(db3, "db");
                    }
                    break;
                }
                break;
            default:
                db3.B("DROP TABLE IF EXISTS `MqMessageEntity`");
                int i14 = MqMessageDatabase_Impl.f72904p;
                List list2 = ((MqMessageDatabase_Impl) d0Var).f75184g;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((lb.a) it2.next()).getClass();
                        Intrinsics.checkNotNullParameter(db3, "db");
                    }
                    break;
                }
                break;
        }
    }

    @Override // e7.e
    public final void j(c db3) {
        int i13 = this.f120902c;
        d0 d0Var = this.f120903d;
        switch (i13) {
            case 0:
                List list = ((CollageDatabase_Impl) d0Var).f75184g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((lb.a) it.next()).getClass();
                        Intrinsics.checkNotNullParameter(db3, "db");
                    }
                    break;
                }
                break;
            default:
                int i14 = MqMessageDatabase_Impl.f72904p;
                List list2 = ((MqMessageDatabase_Impl) d0Var).f75184g;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((lb.a) it2.next()).getClass();
                        Intrinsics.checkNotNullParameter(db3, "db");
                    }
                    break;
                }
                break;
        }
    }

    @Override // e7.e
    public final void k(c cVar) {
        switch (this.f120902c) {
            case 0:
                ((CollageDatabase_Impl) this.f120903d).f75178a = cVar;
                cVar.B("PRAGMA foreign_keys = ON");
                ((CollageDatabase_Impl) this.f120903d).n(cVar);
                List list = ((CollageDatabase_Impl) this.f120903d).f75184g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((lb.a) it.next()).a(cVar);
                    }
                    break;
                }
                break;
            default:
                MqMessageDatabase_Impl mqMessageDatabase_Impl = (MqMessageDatabase_Impl) this.f120903d;
                int i13 = MqMessageDatabase_Impl.f72904p;
                mqMessageDatabase_Impl.f75178a = cVar;
                ((MqMessageDatabase_Impl) this.f120903d).n(cVar);
                List list2 = ((MqMessageDatabase_Impl) this.f120903d).f75184g;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((lb.a) it2.next()).a(cVar);
                    }
                    break;
                }
                break;
        }
    }

    @Override // e7.e
    public final void l(c cVar) {
        switch (this.f120902c) {
            case 0:
                d7.b.B(cVar);
                break;
            default:
                d7.b.B(cVar);
                break;
        }
    }

    @Override // e7.e
    public final x0 m(c cVar) {
        switch (this.f120902c) {
            case 0:
                HashMap hashMap = new HashMap(3);
                hashMap.put("id", new la.a(1, 1, "id", "TEXT", null, true));
                hashMap.put("user_id", new la.a(0, 1, "user_id", "TEXT", null, true));
                hashMap.put("last_updated_at", new la.a(0, 1, "last_updated_at", "INTEGER", null, true));
                la.e eVar = new la.e("collage_drafts", hashMap, new HashSet(0), new HashSet(0));
                la.e a13 = la.e.a(cVar, "collage_drafts");
                if (!eVar.equals(a13)) {
                    break;
                } else {
                    HashMap hashMap2 = new HashMap(3);
                    hashMap2.put("id", new la.a(1, 1, "id", "TEXT", null, true));
                    hashMap2.put("draft_id", new la.a(0, 1, "draft_id", "TEXT", null, true));
                    hashMap2.put("background_image", new la.a(0, 1, "background_image", "TEXT", null, false));
                    HashSet hashSet = new HashSet(1);
                    hashSet.add(new la.b("collage_drafts", "CASCADE", "NO ACTION", Arrays.asList("draft_id"), Arrays.asList("id")));
                    HashSet hashSet2 = new HashSet(1);
                    hashSet2.add(new d("index_collage_page_draft_id", Arrays.asList("draft_id"), Arrays.asList("ASC"), false));
                    la.e eVar2 = new la.e("collage_page", hashMap2, hashSet, hashSet2);
                    la.e a14 = la.e.a(cVar, "collage_page");
                    if (!eVar2.equals(a14)) {
                        break;
                    } else {
                        HashMap hashMap3 = new HashMap(3);
                        hashMap3.put("id", new la.a(1, 1, "id", "TEXT", null, true));
                        hashMap3.put("overlay_item", new la.a(0, 1, "overlay_item", "TEXT", null, true));
                        hashMap3.put("page_id", new la.a(0, 1, "page_id", "TEXT", null, true));
                        HashSet hashSet3 = new HashSet(1);
                        hashSet3.add(new la.b("collage_page", "CASCADE", "NO ACTION", Arrays.asList("page_id"), Arrays.asList("id")));
                        HashSet hashSet4 = new HashSet(1);
                        hashSet4.add(new d("index_collage_item_page_id", Arrays.asList("page_id"), Arrays.asList("ASC"), false));
                        la.e eVar3 = new la.e("collage_item", hashMap3, hashSet3, hashSet4);
                        la.e a15 = la.e.a(cVar, "collage_item");
                        if (!eVar3.equals(a15)) {
                            break;
                        } else {
                            break;
                        }
                    }
                }
            default:
                HashMap hashMap4 = new HashMap(8);
                hashMap4.put("messageId", new la.a(1, 1, "messageId", "TEXT", null, true));
                hashMap4.put("clientHandle", new la.a(0, 1, "clientHandle", "TEXT", null, true));
                hashMap4.put("topic", new la.a(0, 1, "topic", "TEXT", null, true));
                hashMap4.put("mqttMessage", new la.a(0, 1, "mqttMessage", "TEXT", null, true));
                hashMap4.put("qos", new la.a(0, 1, "qos", "INTEGER", null, true));
                hashMap4.put("retained", new la.a(0, 1, "retained", "INTEGER", null, true));
                hashMap4.put("duplicate", new la.a(0, 1, "duplicate", "INTEGER", null, true));
                hashMap4.put("timestamp", new la.a(0, 1, "timestamp", "INTEGER", null, true));
                HashSet hashSet5 = new HashSet(0);
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new d("index_MqMessageEntity_clientHandle", Arrays.asList("clientHandle"), Arrays.asList("ASC"), false));
                la.e eVar4 = new la.e("MqMessageEntity", hashMap4, hashSet5, hashSet6);
                la.e a16 = la.e.a(cVar, "MqMessageEntity");
                if (!eVar4.equals(a16)) {
                    break;
                } else {
                    break;
                }
        }
        return new x0(true, (Serializable) null);
    }
}
