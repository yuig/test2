package kb;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f79049a;

    /* renamed from: b, reason: collision with root package name */
    public UUID f79050b;

    /* renamed from: c, reason: collision with root package name */
    public tb.s f79051c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f79052d;

    public x0(Class workerClass) {
        Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
        this.f79050b = randomUUID;
        String id3 = this.f79050b.toString();
        Intrinsics.checkNotNullExpressionValue(id3, "id.toString()");
        String workerClassName_ = workerClass.getName();
        Intrinsics.checkNotNullExpressionValue(workerClassName_, "workerClass.name");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
        this.f79051c = new tb.s(id3, (s0) null, workerClassName_, (String) null, (l) null, (l) null, 0L, 0L, 0L, (g) null, 0, (a) null, 0L, 0L, 0L, 0L, false, (l0) null, 0, 0L, 0, 0, (String) null, 16777210);
        String name = workerClass.getName();
        Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
        this.f79052d = h1.d(name);
    }

    public final x0 a(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f79052d.add(tag);
        return d();
    }

    public final y0 b() {
        List split$default;
        y0 c13 = c();
        g gVar = this.f79051c.f117025j;
        boolean z13 = gVar.f() || gVar.f78993e || gVar.f78991c || gVar.f78992d;
        tb.s sVar = this.f79051c;
        if (sVar.f117032q) {
            if (!(!z13)) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
            }
            if (sVar.f117022g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
            }
        }
        if (sVar.f117039x == null) {
            split$default = StringsKt__StringsKt.split$default(sVar.f117018c, new String[]{"."}, false, 0, 6, null);
            String str = split$default.size() == 1 ? (String) split$default.get(0) : (String) CollectionsKt.b0(split$default);
            if (str.length() > 127) {
                str = kotlin.text.e0.C(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK, str);
            }
            sVar.f117039x = str;
        }
        UUID id3 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(id3, "randomUUID()");
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f79050b = id3;
        String newId = id3.toString();
        Intrinsics.checkNotNullExpressionValue(newId, "id.toString()");
        tb.s other = this.f79051c;
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
        this.f79051c = new tb.s(newId, other.f117017b, other.f117018c, other.f117019d, new l(other.f117020e), new l(other.f117021f), other.f117022g, other.f117023h, other.f117024i, new g(other.f117025j), other.f117026k, other.f117027l, other.f117028m, other.f117029n, other.f117030o, other.f117031p, other.f117032q, other.f117033r, other.f117034s, other.f117036u, other.f117037v, other.f117038w, other.f117039x, 524288);
        return c13;
    }

    public abstract y0 c();

    public abstract x0 d();

    public final x0 e(a backoffPolicy, long j13, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f79049a = true;
        tb.s sVar = this.f79051c;
        sVar.f117027l = backoffPolicy;
        long millis = timeUnit.toMillis(j13);
        String str = tb.s.f117014y;
        if (millis > 18000000) {
            b0.e().i(str, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            b0.e().i(str, "Backoff delay duration less than minimum value");
        }
        sVar.f117028m = ql2.s.i(millis, 10000L, 18000000L);
        return d();
    }

    public final x0 f(g constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        this.f79051c.f117025j = constraints;
        return d();
    }

    public final x0 g(long j13, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f79051c.f117022g = timeUnit.toMillis(j13);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.f79051c.f117022g) {
            return d();
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
    }

    public final x0 h(l inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f79051c.f117020e = inputData;
        return d();
    }
}
