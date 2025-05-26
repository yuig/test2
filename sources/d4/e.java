package d4;

import java.text.BreakIterator;

/* loaded from: classes3.dex */
public final class e extends pp2.a {

    /* renamed from: b, reason: collision with root package name */
    public final BreakIterator f53671b;

    public e(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f53671b = characterInstance;
    }

    @Override // pp2.a
    public final int H0(int i13) {
        return this.f53671b.following(i13);
    }

    @Override // pp2.a
    public final int I0(int i13) {
        return this.f53671b.preceding(i13);
    }
}
