package so2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 implements to2.f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f114754a;

    /* renamed from: b, reason: collision with root package name */
    public final String f114755b;

    public a0(String discriminator, boolean z13) {
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        this.f114754a = z13;
        this.f114755b = discriminator;
    }

    @Override // to2.f
    public final void a(rl2.d baseClass, Function1 defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // to2.f
    public final void b(rl2.d baseClass, rl2.d actualClass, no2.b actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        oo2.g a13 = actualSerializer.a();
        oo2.n c13 = a13.c();
        if ((c13 instanceof oo2.d) || Intrinsics.d(c13, oo2.l.f96901a)) {
            throw new IllegalArgumentException("Serializer for " + actualClass.f() + " can't be registered as a subclass for polymorphic serialization because its kind " + c13 + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        boolean z13 = this.f114754a;
        if (!z13 && (Intrinsics.d(c13, oo2.o.f96904b) || Intrinsics.d(c13, oo2.o.f96905c) || (c13 instanceof oo2.f) || (c13 instanceof oo2.m))) {
            throw new IllegalArgumentException("Serializer for " + actualClass.f() + " of kind " + c13 + " cannot be serialized polymorphically with class discriminator.");
        }
        if (z13) {
            return;
        }
        int e13 = a13.e();
        for (int i13 = 0; i13 < e13; i13++) {
            String f13 = a13.f(i13);
            if (Intrinsics.d(f13, this.f114755b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + actualClass + " has property '" + f13 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    @Override // to2.f
    public final void c(rl2.d kClass, no2.b serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        e(kClass, new cd2.n(serializer, 23));
    }

    @Override // to2.f
    public final void d(rl2.d baseClass, Function1 defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // to2.f
    public final void e(rl2.d kClass, Function1 provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
