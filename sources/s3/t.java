package s3;

import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t implements ListIterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public int f110931a;

    /* renamed from: b, reason: collision with root package name */
    public final int f110932b;

    /* renamed from: c, reason: collision with root package name */
    public final int f110933c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f110934d;

    public t(v vVar, int i13, int i14) {
        this(vVar, (i14 & 1) != 0 ? 0 : i13, 0, vVar.f110965d);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f110931a < this.f110933c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f110931a > this.f110932b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        Object[] objArr = this.f110934d.f110962a;
        int i13 = this.f110931a;
        this.f110931a = i13 + 1;
        Object obj = objArr[i13];
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (u2.p) obj;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f110931a - this.f110932b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        Object[] objArr = this.f110934d.f110962a;
        int i13 = this.f110931a - 1;
        this.f110931a = i13;
        Object obj = objArr[i13];
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (u2.p) obj;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.f110931a - this.f110932b) - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public t(v vVar, int i13, int i14, int i15) {
        this.f110934d = vVar;
        this.f110931a = i13;
        this.f110932b = i14;
        this.f110933c = i15;
    }
}
