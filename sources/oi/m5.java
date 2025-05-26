package oi;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ m5 f94952a = new m5();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (((Long) obj).longValue() > ((Long) obj2).longValue() ? 1 : (((Long) obj).longValue() == ((Long) obj2).longValue() ? 0 : -1));
    }
}
