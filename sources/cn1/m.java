package cn1;

import androidx.appcompat.widget.SearchView;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ GestaltSearchField f28208i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(GestaltSearchField gestaltSearchField) {
        super(0);
        this.f28208i = gestaltSearchField;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (SearchView.SearchAutoComplete) this.f28208i.findViewById(i.f.search_src_text);
    }
}
