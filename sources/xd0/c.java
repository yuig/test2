package xd0;

import android.database.Cursor;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.wn0;
import com.pinterest.database.ideapindrafts.IdeaPinDraftsTypeConverter$toExportedMediaList$itemType$1;
import com.pinterest.database.ideapindrafts.IdeaPinDraftsTypeConverter$toIdeaPinPage$itemType$1;
import com.pinterest.database.ideapindrafts.IdeaPinDraftsTypeConverter$toPinInterestTag$itemType$1;
import ja.f0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import nm.o;

/* loaded from: classes5.dex */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f134602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f134603c;

    public /* synthetic */ c(f fVar, f0 f0Var, int i13) {
        this.f134601a = i13;
        this.f134603c = fVar;
        this.f134602b = f0Var;
    }

    /* JADX WARN: Finally extract failed */
    public final ArrayList a() {
        String string;
        int i13;
        byte[] blob;
        int i14;
        int i15;
        boolean z13;
        String string2;
        int i16;
        String string3;
        String string4;
        int i17;
        int i18;
        boolean z14;
        int i19 = this.f134601a;
        f0 f0Var = this.f134602b;
        f fVar = this.f134603c;
        switch (i19) {
            case 3:
                Cursor m03 = d7.b.m0(fVar.f134608a, f0Var, false);
                try {
                    ArrayList arrayList = new ArrayList(m03.getCount());
                    while (m03.moveToNext()) {
                        String string5 = m03.getString(0);
                        boolean z15 = m03.getInt(1) != 0;
                        String string6 = m03.isNull(2) ? null : m03.getString(2);
                        int i23 = m03.getInt(3);
                        long j13 = m03.getLong(4);
                        Long valueOf = m03.isNull(5) ? null : Long.valueOf(m03.getLong(5));
                        f.a(fVar).getClass();
                        Date b13 = h.b(valueOf);
                        if (b13 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                        }
                        String string7 = m03.isNull(6) ? null : m03.getString(6);
                        h a13 = f.a(fVar);
                        a13.getClass();
                        List list = (List) ((o) a13.f134621c.getValue()).d(string7, new IdeaPinDraftsTypeConverter$toExportedMediaList$itemType$1().f33847b);
                        if (list == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.List<java.lang.String>', but it was NULL.");
                        }
                        ep.b.A(((o) f.a(fVar).f134621c.getValue()).b(ou1.c.class, m03.isNull(7) ? null : m03.getString(7)));
                        Long valueOf2 = m03.isNull(8) ? null : Long.valueOf(m03.getLong(8));
                        f.a(fVar).getClass();
                        Date b14 = h.b(valueOf2);
                        if (b14 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                        }
                        arrayList.add(new yd0.b(string5, z15, string6, i23, j13, b13, list, null, b14));
                    }
                    m03.close();
                    return arrayList;
                } catch (Throwable th3) {
                    m03.close();
                    throw th3;
                }
            default:
                Cursor m04 = d7.b.m0(fVar.f134608a, f0Var, false);
                try {
                    int w13 = b7.c.w(m04, "id");
                    int w14 = b7.c.w(m04, "user_id");
                    int w15 = b7.c.w(m04, "metadata");
                    int w16 = b7.c.w(m04, "page_data");
                    int w17 = b7.c.w(m04, "tags");
                    int w18 = b7.c.w(m04, "board_id");
                    int w19 = b7.c.w(m04, "board_section_id");
                    int w23 = b7.c.w(m04, "comment_reply_data");
                    int w24 = b7.c.w(m04, "comments_enabled");
                    int w25 = b7.c.w(m04, "text_style_block_id");
                    int w26 = b7.c.w(m04, "extracted_image_metadata");
                    int w27 = b7.c.w(m04, "is_broken");
                    int w28 = b7.c.w(m04, "cover_image_path");
                    int w29 = b7.c.w(m04, "page_count");
                    int w33 = b7.c.w(m04, "duration");
                    int w34 = b7.c.w(m04, "last_updated_at");
                    int w35 = b7.c.w(m04, "exported_media");
                    int w36 = b7.c.w(m04, "link");
                    int w37 = b7.c.w(m04, "created_at");
                    int w38 = b7.c.w(m04, "is_expiration_supported");
                    int w39 = b7.c.w(m04, "scheduled_date");
                    int i24 = w27;
                    ArrayList arrayList2 = new ArrayList(m04.getCount());
                    while (m04.moveToNext()) {
                        String string8 = m04.getString(w13);
                        String string9 = m04.getString(w14);
                        if (m04.isNull(w15)) {
                            i13 = w13;
                            string = null;
                        } else {
                            string = m04.getString(w15);
                            i13 = w13;
                        }
                        int i25 = w14;
                        wn0 wn0Var = (wn0) ((o) f.a(fVar).f134621c.getValue()).b(wn0.class, string);
                        if (wn0Var == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.pinterest.api.model.StoryPinLocalMetadata', but it was NULL.");
                        }
                        String string10 = m04.isNull(w16) ? null : m04.getString(w16);
                        h a14 = f.a(fVar);
                        a14.getClass();
                        tp tpVar = (tp) ((o) a14.f134621c.getValue()).d(string10, new IdeaPinDraftsTypeConverter$toIdeaPinPage$itemType$1().f33847b);
                        String string11 = m04.isNull(w17) ? null : m04.getString(w17);
                        h a15 = f.a(fVar);
                        a15.getClass();
                        List list2 = (List) ((o) a15.f134621c.getValue()).d(string11, new IdeaPinDraftsTypeConverter$toPinInterestTag$itemType$1().f33847b);
                        if (list2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.List<com.pinterest.api.model.PinInterestTag>', but it was NULL.");
                        }
                        String string12 = m04.isNull(w18) ? null : m04.getString(w18);
                        String string13 = m04.isNull(w19) ? null : m04.getString(w19);
                        ep.b.A(((o) f.a(fVar).f134621c.getValue()).b(ou1.c.class, m04.isNull(w23) ? null : m04.getString(w23)));
                        boolean z16 = m04.getInt(w24) != 0;
                        String string14 = m04.isNull(w25) ? null : m04.getString(w25);
                        if (m04.isNull(w26)) {
                            i14 = i24;
                            blob = null;
                        } else {
                            blob = m04.getBlob(w26);
                            i14 = i24;
                        }
                        if (m04.getInt(i14) != 0) {
                            i15 = w28;
                            z13 = true;
                        } else {
                            i15 = w28;
                            z13 = false;
                        }
                        if (m04.isNull(i15)) {
                            i16 = w29;
                            string2 = null;
                        } else {
                            string2 = m04.getString(i15);
                            i16 = w29;
                        }
                        int i26 = m04.getInt(i16);
                        int i27 = w26;
                        int i28 = w33;
                        long j14 = m04.getLong(i28);
                        w33 = i28;
                        int i29 = w34;
                        Long valueOf3 = m04.isNull(i29) ? null : Long.valueOf(m04.getLong(i29));
                        f.a(fVar).getClass();
                        Date b15 = h.b(valueOf3);
                        if (b15 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                        }
                        w34 = i29;
                        int i33 = w35;
                        if (m04.isNull(i33)) {
                            w35 = i33;
                            i24 = i14;
                            string3 = null;
                        } else {
                            w35 = i33;
                            i24 = i14;
                            string3 = m04.getString(i33);
                        }
                        h a16 = f.a(fVar);
                        a16.getClass();
                        int i34 = w24;
                        List list3 = (List) ((o) a16.f134621c.getValue()).d(string3, new IdeaPinDraftsTypeConverter$toExportedMediaList$itemType$1().f33847b);
                        if (list3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.List<java.lang.String>', but it was NULL.");
                        }
                        int i35 = w36;
                        if (m04.isNull(i35)) {
                            i17 = w37;
                            string4 = null;
                        } else {
                            string4 = m04.getString(i35);
                            i17 = w37;
                        }
                        Long valueOf4 = m04.isNull(i17) ? null : Long.valueOf(m04.getLong(i17));
                        f.a(fVar).getClass();
                        Date b16 = h.b(valueOf4);
                        if (b16 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                        }
                        int i36 = w38;
                        if (m04.getInt(i36) != 0) {
                            w36 = i35;
                            i18 = w39;
                            z14 = true;
                        } else {
                            w36 = i35;
                            i18 = w39;
                            z14 = false;
                        }
                        Long valueOf5 = m04.isNull(i18) ? null : Long.valueOf(m04.getLong(i18));
                        f.a(fVar).getClass();
                        w39 = i18;
                        arrayList2.add(new yd0.a(string8, string9, wn0Var, tpVar, list2, string12, string13, null, z16, string14, blob, z13, string2, i26, j14, b15, list3, string4, b16, z14, h.b(valueOf5)));
                        w37 = i17;
                        w38 = i36;
                        w26 = i27;
                        w24 = i34;
                        w28 = i15;
                        w29 = i16;
                        w13 = i13;
                        w14 = i25;
                    }
                    m04.close();
                    return arrayList2;
                } catch (Throwable th4) {
                    m04.close();
                    throw th4;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: all -> 0x0034, TRY_ENTER, TryCatch #0 {all -> 0x0034, blocks: (B:10:0x001e, B:12:0x0024, B:15:0x002b, B:19:0x003d, B:20:0x004a), top: B:9:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085 A[Catch: all -> 0x007c, TRY_ENTER, TryCatch #2 {all -> 0x007c, blocks: (B:28:0x0055, B:30:0x005b, B:35:0x006e, B:38:0x0077, B:42:0x0085, B:43:0x0092, B:46:0x0063), top: B:27:0x0055 }] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xd0.c.call():java.lang.Object");
    }

    public final void finalize() {
        int i13 = this.f134601a;
        f0 f0Var = this.f134602b;
        switch (i13) {
            case 0:
                f0Var.e();
                break;
            case 1:
                f0Var.e();
                break;
            case 2:
                f0Var.e();
                break;
            case 3:
                f0Var.e();
                break;
            default:
                f0Var.e();
                break;
        }
    }
}
