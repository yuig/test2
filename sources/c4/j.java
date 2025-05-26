package c4;

import java.text.CharacterIterator;

/* loaded from: classes3.dex */
public final class j implements CharacterIterator {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f25637a;

    /* renamed from: c, reason: collision with root package name */
    public final int f25639c;

    /* renamed from: b, reason: collision with root package name */
    public final int f25638b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f25640d = 0;

    public j(int i13, CharSequence charSequence) {
        this.f25637a = charSequence;
        this.f25639c = i13;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i13 = this.f25640d;
        if (i13 == this.f25639c) {
            return (char) 65535;
        }
        return this.f25637a.charAt(i13);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f25640d = this.f25638b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.f25638b;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f25639c;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f25640d;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i13 = this.f25638b;
        int i14 = this.f25639c;
        if (i13 == i14) {
            this.f25640d = i14;
            return (char) 65535;
        }
        int i15 = i14 - 1;
        this.f25640d = i15;
        return this.f25637a.charAt(i15);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i13 = this.f25640d + 1;
        this.f25640d = i13;
        int i14 = this.f25639c;
        if (i13 < i14) {
            return this.f25637a.charAt(i13);
        }
        this.f25640d = i14;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i13 = this.f25640d;
        if (i13 <= this.f25638b) {
            return (char) 65535;
        }
        int i14 = i13 - 1;
        this.f25640d = i14;
        return this.f25637a.charAt(i14);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i13) {
        if (i13 > this.f25639c || this.f25638b > i13) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f25640d = i13;
        return current();
    }
}
