package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes4.dex */
public final class c implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f80479a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80480b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80481c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f80482d;

    public c(CharSequence input, int i13, int i14, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f80479a = input;
        this.f80480b = i13;
        this.f80481c = i14;
        this.f80482d = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new b(this);
    }
}
