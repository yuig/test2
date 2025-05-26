package io.embrace.android.embracesdk.internal.payload;

import java.lang.reflect.Constructor;
import java.util.Set;
import kg.a;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import mc2.k;
import oe2.h0;
import oe2.r;
import oe2.v;
import oe2.y;
import org.jetbrains.annotations.NotNull;
import pe2.b;
import pk2.f;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/UserInfoJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/UserInfo;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class UserInfoJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73280a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73281b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73282c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Constructor f73283d;

    public UserInfoJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("id", "em", "un", "per");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"id\", \"em\", \"un\", \"per\")");
        this.f73280a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(String.class, s0Var, "userId");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(String::cl…    emptySet(), \"userId\")");
        this.f73281b = c13;
        r c14 = moshi.c(a.Z(Set.class, String.class), s0Var, "personas");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Types.newP…ySet(),\n      \"personas\")");
        this.f73282c = c14;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        String str = null;
        String str2 = null;
        String str3 = null;
        Set set = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73280a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                str = (String) this.f73281b.a(reader);
                i13 &= -2;
            } else if (k13 == 1) {
                str2 = (String) this.f73281b.a(reader);
                i13 &= -3;
            } else if (k13 == 2) {
                str3 = (String) this.f73281b.a(reader);
                i13 &= -5;
            } else if (k13 == 3) {
                set = (Set) this.f73282c.a(reader);
                i13 &= -9;
            }
        }
        reader.e();
        if (i13 == -16) {
            return new UserInfo(str, str2, str3, set);
        }
        Constructor constructor = this.f73283d;
        if (constructor == null) {
            constructor = UserInfo.class.getDeclaredConstructor(String.class, String.class, String.class, Set.class, Integer.TYPE, b.f100000c);
            this.f73283d = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "UserInfo::class.java.get…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, str3, set, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (UserInfo) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        UserInfo userInfo = (UserInfo) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (userInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("id");
        r rVar = this.f73281b;
        rVar.d(writer, userInfo.f73276a);
        writer.f("em");
        rVar.d(writer, userInfo.f73277b);
        writer.f("un");
        rVar.d(writer, userInfo.f73278c);
        writer.f("per");
        this.f73282c.d(writer, userInfo.f73279d);
        writer.d();
    }

    public final String toString() {
        return f.f(30, "GeneratedJsonAdapter(UserInfo)", "toString(...)");
    }
}
