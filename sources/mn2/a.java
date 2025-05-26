package mn2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import zm2.k;
import zm2.s;

/* loaded from: classes2.dex */
public final class a extends kn2.a {

    /* renamed from: q, reason: collision with root package name */
    public static final a f87796q;

    static {
        k kVar = new k();
        um2.b.a(kVar);
        Intrinsics.checkNotNullExpressionValue(kVar, "apply(...)");
        s packageFqName = um2.b.f122801a;
        Intrinsics.checkNotNullExpressionValue(packageFqName, "packageFqName");
        s constructorAnnotation = um2.b.f122803c;
        Intrinsics.checkNotNullExpressionValue(constructorAnnotation, "constructorAnnotation");
        s classAnnotation = um2.b.f122802b;
        Intrinsics.checkNotNullExpressionValue(classAnnotation, "classAnnotation");
        s functionAnnotation = um2.b.f122804d;
        Intrinsics.checkNotNullExpressionValue(functionAnnotation, "functionAnnotation");
        s propertyAnnotation = um2.b.f122805e;
        Intrinsics.checkNotNullExpressionValue(propertyAnnotation, "propertyAnnotation");
        s propertyGetterAnnotation = um2.b.f122806f;
        Intrinsics.checkNotNullExpressionValue(propertyGetterAnnotation, "propertyGetterAnnotation");
        s propertySetterAnnotation = um2.b.f122807g;
        Intrinsics.checkNotNullExpressionValue(propertySetterAnnotation, "propertySetterAnnotation");
        s enumEntryAnnotation = um2.b.f122809i;
        Intrinsics.checkNotNullExpressionValue(enumEntryAnnotation, "enumEntryAnnotation");
        s compileTimeValue = um2.b.f122808h;
        Intrinsics.checkNotNullExpressionValue(compileTimeValue, "compileTimeValue");
        s parameterAnnotation = um2.b.f122810j;
        Intrinsics.checkNotNullExpressionValue(parameterAnnotation, "parameterAnnotation");
        s typeAnnotation = um2.b.f122811k;
        Intrinsics.checkNotNullExpressionValue(typeAnnotation, "typeAnnotation");
        s typeParameterAnnotation = um2.b.f122812l;
        Intrinsics.checkNotNullExpressionValue(typeParameterAnnotation, "typeParameterAnnotation");
        f87796q = new a(kVar, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    public static String a(ym2.c fqName) {
        String b13;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        StringBuilder sb3 = new StringBuilder();
        String b14 = fqName.b();
        Intrinsics.checkNotNullExpressionValue(b14, "asString(...)");
        sb3.append(z.m(b14, '.', '/'));
        sb3.append('/');
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        StringBuilder sb4 = new StringBuilder();
        if (fqName.d()) {
            b13 = "default-package";
        } else {
            b13 = fqName.f().b();
            Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        }
        sb4.append(b13);
        sb4.append(".kotlin_builtins");
        sb3.append(sb4.toString());
        return sb3.toString();
    }
}
