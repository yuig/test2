package kotlin.text;

import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Regex f80500i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CharSequence f80501j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f80502k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Regex regex, CharSequence charSequence, int i13) {
        super(0);
        this.f80500i = regex;
        this.f80501j = charSequence;
        this.f80502k = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MatchResult invoke() {
        return this.f80500i.b(this.f80502k, this.f80501j);
    }
}
