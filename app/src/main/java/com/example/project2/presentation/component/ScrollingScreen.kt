import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.R
import com.example.project2.data.datastore.dataStore
import com.example.project2.presentation.component.GoldCard
import com.example.project2.presentation.component.ListCard
import com.example.project2.presentation.component.SectionHeader
import com.example.project2.presentation.component.TabContent
import com.example.project2.presentation.component.TopBar

//Scrolling flow
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ScrollingScreen(viewModel: Screen1ViewModel,
                    IsStatusButtonClicked: Boolean,
                    onclickStatus: () -> Unit,
                    scrollState: LazyListState,
                    modifier: Modifier = Modifier
) {
    LazyColumn (state=scrollState,modifier= Modifier
        .background(Color(0xFF1D1829))){
        item {
            TopBar()
             }
        stickyHeader {
            TabContent(
                modifier
                    .background(
                        brush = Brush.radialGradient( //Background image
                            colors = listOf(Color(0xFF3A1576), Color(0xFF21174A)),
                            center = Offset(500f, 100f),
                            radius = 600f
                        )
                    )
                    .fillMaxWidth()
            )
        }
        item {
            GoldCard(modifier= Modifier
                .fillMaxWidth()
                .height(190.dp)
                .background(
                    brush = Brush.radialGradient( //Background image
                        colors = listOf(Color(0xFF3A1576), Color(0xFF21174A)),
                        center = Offset(500f, 100f),
                        radius = 450f
                    )
                ))
        }
        stickyHeader {
            if(scrollState.firstVisibleItemIndex>=3){
                Column {
                    TabContent(
                        modifier
                            .background(
                                brush = Brush.radialGradient( //Background image
                                    colors = listOf(Color(0xFF3A1576), Color(0xFF21174A)),
                                    center = Offset(500f, 100f),
                                    radius = 600f
                                )
                            )
                            .statusBarsPadding())
                    ButtonRow(onclickStatus = onclickStatus,
                        modifier
                            .padding(vertical = 0.dp, horizontal = 4.dp)
                            .background(color = Color(0xFF1D1829))
                    )
                }
                Log.d("yash",IsStatusButtonClicked.toString())

            }else{
                ButtonRow(onclickStatus = onclickStatus,
                    modifier.padding(vertical = 8.dp, horizontal = 4.dp))
            }
        }
        item{
            SectionHeader(text = "Today")
        }
        items(viewModel.contentList){
                content->
            ListCard(content)
        }
        item{
            SectionHeader(text = "Yesterday")
        }
        items(viewModel.contentList){
                content->
            ListCard(content)
        }
        item{
            SectionHeader(text = "4 October 2024")
        }
        items(viewModel.contentList){
                content->
            ListCard(content)
        }
    }

}
