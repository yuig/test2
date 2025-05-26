package ue1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.li;
import com.pinterest.navigation.Navigation;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class n implements a0, v {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f122039a;

    /* renamed from: b, reason: collision with root package name */
    public final Navigation f122040b;

    /* renamed from: c, reason: collision with root package name */
    public final wa2.i f122041c;

    /* renamed from: d, reason: collision with root package name */
    public final li f122042d;

    /* renamed from: e, reason: collision with root package name */
    public final String f122043e;

    /* renamed from: f, reason: collision with root package name */
    public final Function2 f122044f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f122045g;

    /* renamed from: h, reason: collision with root package name */
    public final f30 f122046h;

    public n(@NotNull f30 pin, Navigation navigation, @NotNull wa2.i pinFeatureConfig, li liVar, String str, @NotNull Function2<? super String, ? super HashMap<String, Object>, Unit> ideaPinRepNavigator, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(ideaPinRepNavigator, "ideaPinRepNavigator");
        this.f122039a = pin;
        this.f122040b = navigation;
        this.f122041c = pinFeatureConfig;
        this.f122042d = liVar;
        this.f122043e = str;
        this.f122044f = ideaPinRepNavigator;
        this.f122045g = z13;
        this.f122046h = pin;
    }

    @Override // ue1.v
    public final f30 a() {
        return this.f122046h;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getUid() {
        String uid = this.f122039a.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return uid;
    }

    @Override // ue1.a0
    public final String d() {
        return bs1.c.p0(this.f122039a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f122039a, nVar.f122039a) && Intrinsics.d(this.f122040b, nVar.f122040b) && Intrinsics.d(this.f122041c, nVar.f122041c) && Intrinsics.d(this.f122042d, nVar.f122042d) && Intrinsics.d(this.f122043e, nVar.f122043e) && Intrinsics.d(this.f122044f, nVar.f122044f) && this.f122045g == nVar.f122045g;
    }

    @Override // ue1.a0
    public final boolean f() {
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f122039a.hashCode() * 31;
        Navigation navigation = this.f122040b;
        int hashCode2 = (this.f122041c.hashCode() + ((hashCode + (navigation == null ? 0 : navigation.hashCode())) * 31)) * 31;
        li liVar = this.f122042d;
        int hashCode3 = (hashCode2 + (liVar == null ? 0 : liVar.hashCode())) * 31;
        String str = this.f122043e;
        return Boolean.hashCode(this.f122045g) + ((this.f122044f.hashCode() + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    @Override // ue1.a0
    public final p i() {
        return t.IDEA_PIN_REP;
    }

    @Override // ue1.a0
    public final int m() {
        return 39;
    }

    @Override // ue1.a0
    public final m p() {
        return null;
    }

    @Override // ue1.a0
    public final int t() {
        return xe1.v.f134804s;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IdeaPinRepItemViewModel(pin=");
        sb3.append(this.f122039a);
        sb3.append(", navigation=");
        sb3.append(this.f122040b);
        sb3.append(", pinFeatureConfig=");
        sb3.append(this.f122041c);
        sb3.append(", ideaPinDisplayOptions=");
        sb3.append(this.f122042d);
        sb3.append(", deeplinkUrl=");
        sb3.append(this.f122043e);
        sb3.append(", ideaPinRepNavigator=");
        sb3.append(this.f122044f);
        sb3.append(", useRegularPinActionHandler=");
        return a.a.r(sb3, this.f122045g, ")");
    }

    public /* synthetic */ n(f30 f30Var, Navigation navigation, wa2.i iVar, li liVar, String str, Function2 function2, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f30Var, navigation, iVar, liVar, (i13 & 16) != 0 ? null : str, function2, (i13 & 64) != 0 ? true : z13);
    }
}
