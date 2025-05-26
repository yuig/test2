package k72;

import f72.x;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import sq2.l;
import sq2.o;
import sq2.p;
import sq2.q;
import sq2.s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lk72/a;", "", "Lokhttp3/RequestBody;", "data", "Lokhttp3/MultipartBody$Part;", "image", "Ld72/c;", "Lf72/x;", "a", "(Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lbl2/c;)Ljava/lang/Object;", "", "shuffleId", "c", "(Ljava/lang/String;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lbl2/c;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "shuffles-data_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface a {
    @l
    @o("shuffles/?fields=shuffle.{id,version,source_app_type_detailed,is_draft,edge_score,images[70x,345x,736x,750x],posted_comments_count,is_compatible,details,updated_at,comments_count,private,created_at,type,reaction_counts,items,link,posted_at,is_finished,reaction_by_me,descendants_count,effect_data,parent(),root(),canonical_pin(),image_tracking_id},shuffleitem.{id,template_config,item_type,pin,text,shuffle_item_image(),offset,scale,rotation,effect_data,mask,shuffle_asset,images[70x,345x,736x,750x]},shuffle.user(),shuffleitemimage.{id,user(),source},user.{id,username,is_employee,first_name,last_name,email,image_medium_url,image_large_url,image_xlarge_url,shuffles_followed_by_me},shuffleasset.{id,user,type,item_type,is_favorited_by_me},shuffleasset.cutout_images[345x,736x,750x,originals]")
    Object a(@NotNull @q("shuffle_data") RequestBody requestBody, @q MultipartBody.Part part, @NotNull bl2.c<? super d72.c<x>> cVar);

    @sq2.f("shuffles/{shuffleId}/?fields=shuffle.{id,version,source_app_type_detailed,is_draft,edge_score,images[70x,345x,736x,750x],posted_comments_count,is_compatible,details,updated_at,comments_count,private,created_at,type,reaction_counts,items,link,posted_at,is_finished,reaction_by_me,descendants_count,effect_data,parent(),root(),canonical_pin(),image_tracking_id},shuffleitem.{id,template_config,item_type,pin,text,shuffle_item_image(),offset,scale,rotation,effect_data,mask,shuffle_asset,images[70x,345x,736x,750x]},shuffle.user(),shuffleitemimage.{id,user(),source},user.{id,username,is_employee,first_name,last_name,email,image_medium_url,image_large_url,image_xlarge_url,shuffles_followed_by_me},shuffleasset.{id,user,type,item_type,is_favorited_by_me},shuffleasset.cutout_images[345x,736x,750x,originals]")
    Object b(@s("shuffleId") @NotNull String str, @NotNull bl2.c<? super d72.c<x>> cVar);

    @l
    @p("shuffles/{shuffle_id}/?fields=shuffle.{id,version,source_app_type_detailed,is_draft,edge_score,images[70x,345x,736x,750x],posted_comments_count,is_compatible,details,updated_at,comments_count,private,created_at,type,reaction_counts,items,link,posted_at,is_finished,reaction_by_me,descendants_count,effect_data,parent(),root(),canonical_pin(),image_tracking_id},shuffleitem.{id,template_config,item_type,pin,text,shuffle_item_image(),offset,scale,rotation,effect_data,mask,shuffle_asset,images[70x,345x,736x,750x]},shuffle.user(),shuffleitemimage.{id,user(),source},user.{id,username,is_employee,first_name,last_name,email,image_medium_url,image_large_url,image_xlarge_url,shuffles_followed_by_me},shuffleasset.{id,user,type,item_type,is_favorited_by_me},shuffleasset.cutout_images[345x,736x,750x,originals]")
    Object c(@s("shuffle_id") @NotNull String str, @NotNull @q("shuffle_data") RequestBody requestBody, @q MultipartBody.Part part, @NotNull bl2.c<? super d72.c<x>> cVar);
}
