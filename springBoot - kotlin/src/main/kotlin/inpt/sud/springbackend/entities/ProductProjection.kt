package inpt.sud.springbackend.entities

import inpt.sud.springbackend.data.Product
import org.springframework.data.rest.core.config.Projection

@Projection(name = "P1", types = [Product::class])
interface ProductProjection {
    val currentPrice: Double
}