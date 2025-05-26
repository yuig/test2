package u71;

import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.y;
import pa.c;

/* loaded from: classes5.dex */
public final class a extends ka.b {

    /* renamed from: c, reason: collision with root package name */
    public final y f120901c;

    public a() {
        super(1, 2);
        this.f120901c = new y();
    }

    @Override // ka.b
    public final void a(c db3) {
        db3.B("CREATE TABLE IF NOT EXISTS `_new_collage_drafts` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `last_updated_at` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db3.B("INSERT INTO `_new_collage_drafts` (`id`,`user_id`,`last_updated_at`) SELECT `id`,`user_id`,`last_updated_at` FROM `collage_drafts`");
        db3.B("DROP TABLE `collage_drafts`");
        db3.B("ALTER TABLE `_new_collage_drafts` RENAME TO `collage_drafts`");
        this.f120901c.getClass();
        Intrinsics.checkNotNullParameter(db3, "db");
    }
}
