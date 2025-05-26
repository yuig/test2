package ew;

import android.util.Base64;
import com.pinterest.api.model.bt0;
import com.pinterest.api.model.xs0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.e0;
import m60.w;

/* loaded from: classes.dex */
public final class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final w f60284a;

    /* renamed from: b, reason: collision with root package name */
    public final fw.b f60285b;

    /* renamed from: c, reason: collision with root package name */
    public final mw.a f60286c;

    /* renamed from: d, reason: collision with root package name */
    public final iw.a f60287d;

    /* renamed from: e, reason: collision with root package name */
    public xs0 f60288e;

    /* renamed from: f, reason: collision with root package name */
    public String f60289f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f60290g;

    /* renamed from: h, reason: collision with root package name */
    public k f60291h;

    /* renamed from: i, reason: collision with root package name */
    public int f60292i;

    /* renamed from: j, reason: collision with root package name */
    public int f60293j;

    /* renamed from: k, reason: collision with root package name */
    public int f60294k;

    public c(w eventManager, fw.b adsGmaHeaderAnalytics, mw.a adsGmaHeaderUtils, iw.a cache) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(adsGmaHeaderAnalytics, "adsGmaHeaderAnalytics");
        Intrinsics.checkNotNullParameter(adsGmaHeaderUtils, "adsGmaHeaderUtils");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f60284a = eventManager;
        this.f60285b = adsGmaHeaderAnalytics;
        this.f60286c = adsGmaHeaderUtils;
        this.f60287d = cache;
        this.f60291h = k.FAIL_QUARANTINE_NOT_STARTED;
    }

    public static String b(int i13) {
        return a.a.j("x-pinterest-gma", i13 > 0 ? a.a.d("-", i13 + 1) : "");
    }

    public final String a(n surface) {
        String Z;
        iw.a aVar = this.f60287d;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(surface, "surface");
        List list = (List) aVar.f73740d.get(surface.name());
        if (list == null || (Z = CollectionsKt.Z(list, ",", null, null, 0, null, null, 62)) == null) {
            return null;
        }
        return e0.C(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, Z);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(ew.n r23, java.util.Map r24) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ew.c.c(ew.n, java.util.Map):void");
    }

    public final String d(n nVar, String data) {
        bt0 f13;
        String str;
        int i13;
        xs0 xs0Var = this.f60288e;
        if (xs0Var == null || (f13 = xs0Var.f()) == null || !Intrinsics.d(f13.r(), Boolean.TRUE)) {
            return data;
        }
        this.f60286c.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            Writer outputStreamWriter = new OutputStreamWriter(gZIPOutputStream, UTF_8);
            BufferedWriter bufferedWriter = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
            try {
                bufferedWriter.write(data);
                bufferedWriter.close();
                Unit unit = Unit.f80348a;
                dl2.b.J(bufferedWriter, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                byte[] encode = Base64.encode(byteArray, 2);
                Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
                str = new String(encode, Charsets.UTF_8);
            } finally {
            }
        } catch (Exception unused) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        int i14 = b.f60283a[nVar.ordinal()];
        if (i14 == 1) {
            i13 = this.f60292i;
        } else if (i14 == 2) {
            i13 = this.f60293j;
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = this.f60294k;
        }
        this.f60285b.b("compression_failed", i13, a(nVar), nVar);
        return null;
    }

    public final void e(k state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f60291h = state;
    }
}
