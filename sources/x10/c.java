package x10;

import df.j1;
import ey.u;
import java.io.ByteArrayInputStream;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import qz.f0;
import x02.d2;
import xk2.m;
import xk2.v;

/* loaded from: classes3.dex */
public final class c extends d2 {

    /* renamed from: v, reason: collision with root package name */
    public final v f131563v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vd0.c pinJson) {
        super(pinJson);
        Intrinsics.checkNotNullParameter(pinJson, "pinJson");
        this.f131563v = m.b(new lr.v(this, 21));
    }

    public static void b(String str, String str2, LinkedHashMap linkedHashMap) {
        if (j1.d1(str2)) {
            RequestBody.Companion companion = RequestBody.f95711a;
            Intrinsics.f(str2);
            companion.getClass();
            linkedHashMap.put(str, RequestBody.Companion.a(str2, null));
        }
    }

    public static void c(f0 f0Var, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        f0Var.e(str, str2);
    }

    public static boolean d(f0 f0Var, String str, String str2) {
        if (!j1.U0(str2) || !j1.d1(str2)) {
            return false;
        }
        Intrinsics.f(str2);
        f0Var.e(str, str2);
        return true;
    }

    public final Pair e() {
        byte[] bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b("sdk_client_id", this.f131327h, linkedHashMap);
        if (this.f131320a.length() > 0) {
            b("board_id", this.f131320a, linkedHashMap);
        } else {
            b("create_default_board", "true", linkedHashMap);
        }
        b("title", this.f131321b, linkedHashMap);
        b("description", this.f131322c, linkedHashMap);
        b("share_twitter", String.valueOf(this.f131326g), linkedHashMap);
        b("media_upload_id", this.f131331l, linkedHashMap);
        b("method", this.f131328i, linkedHashMap);
        b("virtual_try_on_tagged_ids", this.f131335p, linkedHashMap);
        b("user_mention_tags", this.f131336q, linkedHashMap);
        b("section", this.f131332m, linkedHashMap);
        b("image_url", this.f131324e, linkedHashMap);
        b("source_url", this.f131323d, linkedHashMap);
        b("color", this.f131329j, linkedHashMap);
        b("found_metadata", this.f131333n, linkedHashMap);
        b("alt_text", this.f131337r, linkedHashMap);
        b("shuffle", this.f131339t, linkedHashMap);
        b("is_shuffle_remixable", String.valueOf(this.f131340u), linkedHashMap);
        b("add_fields", "pin.images[236x,736x,136x136]", linkedHashMap);
        b("fields", n00.b.a(n00.c.BOARD_SECTION_PIN_JOIN), linkedHashMap);
        MultipartBody.Part part = null;
        if (!linkedHashMap.containsKey("image_url") && (bArr = (byte[]) this.f131563v.getValue()) != null) {
            MultipartBody.Part.Companion companion = MultipartBody.Part.f95670c;
            RequestBody.Companion companion2 = RequestBody.f95711a;
            MediaType.f95651d.getClass();
            RequestBody$Companion$toRequestBody$2 e13 = RequestBody.Companion.e(companion2, bArr, MediaType.Companion.b("image/jpeg"), 6);
            companion.getClass();
            part = MultipartBody.Part.Companion.b("image", "myphoto.jpg", e13);
        }
        return new Pair(linkedHashMap, part);
    }

    public final f0 f() {
        f0 f0Var = new f0();
        c(f0Var, "sdk_client_id", this.f131327h);
        f0Var.e("board_id", this.f131320a);
        c(f0Var, "title", this.f131321b);
        c(f0Var, "description", this.f131322c);
        f0Var.e("share_twitter", String.valueOf(this.f131326g));
        c(f0Var, "media_upload_id", this.f131331l);
        c(f0Var, "method", this.f131328i);
        c(f0Var, "virtual_try_on_tagged_ids", this.f131335p);
        c(f0Var, "user_mention_tags", this.f131336q);
        c(f0Var, "section", this.f131332m);
        if (!d(f0Var, "image_url", this.f131324e)) {
            v vVar = this.f131563v;
            if (((byte[]) vVar.getValue()) != null) {
                ByteArrayInputStream stream = new ByteArrayInputStream((byte[]) vVar.getValue());
                Intrinsics.checkNotNullParameter("image", "key");
                Intrinsics.checkNotNullParameter(stream, "stream");
                f0Var.f105398b.put("image", u.b(stream, "image/jpeg"));
            }
        }
        d(f0Var, "source_url", this.f131323d);
        d(f0Var, "color", this.f131329j);
        c(f0Var, "found_metadata", this.f131333n);
        c(f0Var, "alt_text", this.f131337r);
        c(f0Var, "shuffle", this.f131339t);
        f0Var.d(Boolean.valueOf(this.f131340u), "is_shuffle_remixable");
        return f0Var;
    }
}
