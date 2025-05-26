package nt;

import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g1 extends h1 {

    /* renamed from: c, reason: collision with root package name */
    public final GestaltRadioGroup f92043c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f92044d;

    /* renamed from: e, reason: collision with root package name */
    public final List f92045e;

    /* renamed from: f, reason: collision with root package name */
    public String f92046f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(n1 questionId, GestaltRadioGroup gestaltRadioGroup, GestaltRadioGroup gestaltRadioGroup2, List radioOptionTexts) {
        super(questionId, gestaltRadioGroup);
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(gestaltRadioGroup2, "gestaltRadioGroup");
        Intrinsics.checkNotNullParameter(radioOptionTexts, "radioOptionTexts");
        Intrinsics.checkNotNullParameter("", "answer");
        this.f92043c = gestaltRadioGroup2;
        this.f92044d = false;
        this.f92045e = radioOptionTexts;
        this.f92046f = "";
    }

    @Override // nt.h1
    public final String a() {
        return this.f92046f;
    }

    @Override // nt.h1
    public final void b(String newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        this.f92043c.t(new hs.a(6, this, newData));
    }
}
