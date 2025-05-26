package gm2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t extends y implements pm2.q {

    /* renamed from: a, reason: collision with root package name */
    public final Constructor f65790a;

    public t(Constructor member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f65790a = member;
    }

    @Override // gm2.y
    public final Member b() {
        return this.f65790a;
    }

    @Override // pm2.q
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f65790a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new e0(typeVariable));
        }
        return arrayList;
    }
}
