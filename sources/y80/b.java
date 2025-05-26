package y80;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import nm.r;
import nm.s;
import nm.v;
import nm.w;

/* loaded from: classes5.dex */
public final class b implements w, r {

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f138024a = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss Z", Locale.US);

    @Override // nm.r
    public final Object a(s sVar, Type type, j jVar) {
        Date parse = this.f138024a.parse(sVar != null ? sVar.p() : null);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        return parse;
    }

    @Override // nm.w
    public final s serialize(Object obj) {
        return new v(this.f138024a.format((Date) obj));
    }
}
